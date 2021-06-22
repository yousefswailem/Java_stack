package com.axsos.yousef.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;
@Entity
@Table(name="language")
public class language {
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;
	    @NotNull
	    @Size(min = 2, max = 20)
	    private String name;
	    @NotNull
	    @Size(min = 5, max = 200)
	    private String creater;
	    @NotNull
	    @Max(10)
	    private String version;
	    @Column(updatable=false)
	    @DateTimeFormat(pattern="yyyy-mm-dd")
	    private Date createdAt;
	    @DateTimeFormat(pattern="yyyy-mm-dd")
	    private Date updatedAt;
	    
	    @PrePersist
	    protected void onCreate(){
	        this.createdAt = new Date();
	    }
	    @PreUpdate
	    protected void onUpdate(){
	        this.updatedAt = new Date();
	    }
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCreater() {
			return creater;
		}
		public void setCreater(String creater) {
			this.creater = creater;
		}
		public String getVersion() {
			return version;
		}
		public void setVersion(String version) {
			this.version = version;
		}
	    
}
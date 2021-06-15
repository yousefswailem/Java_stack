public class Project{

    private String name ;
    private String description ;
    private static int count=0;

    public Project() {
        count++;
    }

    public Project(String name) {
        this.name=name;
        count++;
    }

    public Project(String name, String description) {
        this.name=name;
        this.description=description;
        count++;
    }
    
    public static int getNumer(){
        return count;
    }

    public String elevatorPitch(){
        return "Name: "+this.getName()+", Description: "+this.getDescription();
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    
}

package com.yousef.algo;

public abstract class Rectangle {
	private int length;
	private int width;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public abstract double getArea() ;
	@Override
	public String toString() {
		return "Shape [toString()=" + super.toString() + "]";
	}

}

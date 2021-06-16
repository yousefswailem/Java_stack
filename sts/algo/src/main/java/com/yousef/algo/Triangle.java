package com.yousef.algo;

public abstract class  Triangle {
	private int base;
	private int height;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public double getArea() {
		return base*height;
	}
	@Override
	public String toString() {
		return "Shape [toString()=" + super.toString() + "]";
	}
}

package dev.jcclair.models;

public class Point {

	// Properties
	private double x;
	private double y;
	private double z;
	
	// CTOR
	public Point(double X, double Y, double Z) {
		this.setPoints(X, Y, Z);
	}
	
	
	// Getters and Setters
	public double[] getPoints() {
		double[] container = {this.x, this.y,this.z};
		return container;
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public double getZ() {
		return this.z;
	}
	
	public void setPoints(double pointA, double pointB, double pointC) {
		this.x = pointA;
		this.y = pointB;
		this.z = pointC;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public void setZ(double z) {
		this.z = z;
	}
	
	@Override
	public String toString() {
		String string = "X: " + this.getX() + " Y: " + this.getY() + " Z: " + this.getZ();
		return string;
	}
	
}

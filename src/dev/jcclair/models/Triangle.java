package dev.jcclair.models;

public class Triangle {

	// Properties
	private Point[] points;
	
	// CTOR
	public Triangle(Point A, Point B, Point C) {
		this.points[0] = A;
		this.points[1] = B;
		this.points[2] = C;
	}
	
	// Getters and Setters
	public Point[] getPoints() {
		return this.points;
	}
	
	public void setPoints(Point pointA, Point pointB, Point pointC) {
		this.points[0] = pointA;
		this.points[1] = pointB;
		this.points[2] = pointC;
	}
	
	public void setPoint(int index, Point point) {
		if(index < 0 || index > 2)
			return;
		this.points[index].setX(point.getX());
		this.points[index].setY(point.getY());
		this.points[index].setZ(point.getZ());
	}
	

}
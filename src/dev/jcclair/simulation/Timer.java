package dev.jcclair.simulation;


public class Timer {
	private double starttick = 0;

	// Properties
	
	// CTOR
	
	// Methods
	
	public void start() {
		this.starttick = System.currentTimeMillis();
	}
	
	public double getTime() {
		double currenttick = System.currentTimeMillis();
		double delta = (currenttick - this.starttick);
		
		return delta;
	}
	
	public void reset() {
		this.starttick = System.currentTimeMillis();
	}
	
	@Override
	public String toString() {
		String temp;
		temp = "Time: " + this.getTime();
		return temp;
	}
}

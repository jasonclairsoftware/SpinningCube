package dev.jcclair.main;

import dev.jcclair.simulation.Simulation;

public class Main {

	public static void main(String[] args) {
		System.out.println("Program running.");

		Thread simthread = new Thread(new Simulation());
		simthread.start();
		
		
	}

}

package dev.jcclair.simulation;

public class Simulation implements Runnable{
	private boolean isRunning = true;
	private Timer timer;
	private int FPSSegment = 0;
	
	// CTOR
	public Simulation() {
		timer = new Timer();
		this.FPSSegment = 17;

	}

	@Override
	public void run() {
		System.out.println("Thread is running.");
		this.timer.start();
		this.loop();
		System.out.println("Simulation thread is ending.");
	}
	
	private void loop() {
		System.out.println("Simulation loop has started.");
		while(this.isRunning) {
			this.update();
			this.render();
		}
		System.out.println("Simulation loop is ending.");
		
	}
	
	int counter = 0;
	private void update() {
		// TODO:: Updating timer and FPS counter
		// DO things
		
		
		
		
		// This sleeps the thread for the time remaining to not burn out the CPU
		// 17 is the mili for the segment for 
		try {
			Thread.sleep(this.FPSSegment-(int)this.timer.getTime());
			this.timer.reset();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("counter: " + counter/60);
		if(counter++/60 > 5) {
			this.isRunning = false;
		}
	}
	
	private void render() {
		// TODO:: Just get something spinning for now.
	}

	
}

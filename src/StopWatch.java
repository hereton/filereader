
/**
 * Stopwatch in program.
 * 
 * @author ton
 *
 */
public class StopWatch {
	private boolean running = false;
	private long start, stop;
	private double elapsed;

	/**
	 * start to count time.
	 */
	public void start() {
		if (!isRunning()) {
			this.start = System.nanoTime();
			running = true;
		}
	}

	/**
	 * stop to count time.
	 */
	public void stop() {
		if (isRunning()) {
			this.stop = System.nanoTime();
			this.elapsed = (double) (this.stop - this.start) * 1e-9;
			this.running = false;
		}
	}

	/**
	 * Get total time that used in task.
	 * 
	 * @return
	 */
	public double getElapsed() {
		if (isRunning())
			return (double) (System.nanoTime() - this.start) * 1e-9;
		return this.elapsed;
	}

	/**
	 * Check if the time is counting or not.
	 * 
	 * @return true if yes, false otherwise.
	 */
	public boolean isRunning() {
		return this.running;
	}

}

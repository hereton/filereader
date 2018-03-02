
/**
 * Count timer in task.
 * 
 * @author ton
 *
 */
public class TaskTimer {
	StopWatch watch = new StopWatch();

	public void run(Runnable task) {
		watch.start();
		task.run();
		watch.stop();
		System.out.println("the time is " + watch.getElapsed()+"\n");
	}
}

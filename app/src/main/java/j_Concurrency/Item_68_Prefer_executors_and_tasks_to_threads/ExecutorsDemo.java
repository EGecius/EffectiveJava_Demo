package j_Concurrency.Item_68_Prefer_executors_and_tasks_to_threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Shows different executors
 */
final class ExecutorsDemo {

	void executeOnSingledThreadPool(Runnable runnable) {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.execute(runnable);
	}

	/** Creates a new thread if there isn't one available */
	void executeOnCachedThreadPool(Runnable runnable) {
		ExecutorService executor = Executors.newCachedThreadPool();
		executor.execute(runnable);
	}

}

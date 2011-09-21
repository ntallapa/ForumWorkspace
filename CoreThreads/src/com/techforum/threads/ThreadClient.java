/**
 * 
 */
package com.techforum.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * @author ntallapa
 *
 */
public class ThreadClient {

	/**
	 * if you see the stack trace, the exception will not be propagated
	 * to the main thread
	 */
	public void invokeRunnableThread() {
		try {
			Thread rt = new Thread(new RunnableThread());
			rt.start();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	/**
	 * Here the exception will be propagated
	 * to the main thread
	 */
	public void invokeCallableThread() {
		try {
			Callable<Integer> callable = (new CallableThread());
			ExecutorService executor = new ScheduledThreadPoolExecutor(5);
			Future<Integer> future = executor.submit(callable);
			System.out.println("return value: "+future.get());
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ThreadClient tc = new ThreadClient();
		
		// Invoke Runnable thread
		tc.invokeRunnableThread();
		
		// Invoke Callable thread
		tc.invokeCallableThread();
		
	}

}

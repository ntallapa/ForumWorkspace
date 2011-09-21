/**
 * 
 */
package com.techforum.threads;

import java.util.concurrent.Callable;

/**
 * @author ntallapa
 *
 */
public class CallableThread implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		// Introduce programmatic exception in the code
		Class myClass = Class.forName("test");
		return 1;
	}

}

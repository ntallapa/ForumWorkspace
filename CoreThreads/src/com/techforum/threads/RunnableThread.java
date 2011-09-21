/**
 * 
 */
package com.techforum.threads;

/**
 * @author ntallapa
 *
 */
public class RunnableThread implements Runnable {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {

		System.out.println("Started run method");
		
		// throw run time exception
		throw new NullPointerException("Programmatic Error");
		
		//System.out.println("Ended run method");
	}

}

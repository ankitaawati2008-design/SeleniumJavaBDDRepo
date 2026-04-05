
package com.tcs.exceptions;
//we did not extend by exception because then we have to handle and throws it everytime. 
//It will be of type checked if we use extends Exception and we want to make unchecked exception hence use RuntimeException
//	Anyways we will get to know the browser name sent in runtime only and not before

/**
 * This exception will be thrown when user passed invalid browser name
 * Valid browser names supported by this framework are
 * <ul>
 * 	<li>Chrome</li>
 * 	<li>Firefox</li>
 * </ul>
 */
public class InvalidBrowserNameException extends RuntimeException{
private String browserName;
	
	public InvalidBrowserNameException(String browserName) {
		this.browserName= browserName;
	}
	
	@Override
		public String getMessage() {
			// TODO Auto-generated method stub
			return this.browserName+"browser is not supported";
		}
}

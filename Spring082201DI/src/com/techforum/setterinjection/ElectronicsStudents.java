/**
 * 
 */
package com.techforum.setterinjection;

/**
 * @author ntallapa
 *
 */
public class ElectronicsStudents implements StudentFinder {
	ElectronicsStudents() {
		System.out.println("Instantiating ElectronicsStudents Object");
	}

	@Override
	public String findStudent() {
		// TODO Auto-generated method stub
		return "Java Panda";
	}

}

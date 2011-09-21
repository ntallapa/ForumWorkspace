package com.techforum.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author ntallapa
 *
 */
public class StudentLister {
	private StudentFinder finder;
	ApplicationContext context = new FileSystemXmlApplicationContext("src\\applicationconfig.xml");

	public StudentLister() {
		//finder = new ElectronicsStudents();
		
		// Get the instance using spring framework
		finder = (ElectronicsStudents)context.getBean("students");
	}
	
	public static void main(String[] args) {
		new StudentLister();
	}
}

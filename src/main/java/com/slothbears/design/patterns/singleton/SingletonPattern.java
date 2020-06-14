package com.slothbears.design.patterns.singleton;

/*
 * This pattern involves a single class which is responsible to create an object 
 * while making sure that only single object gets created.
 */

public class SingletonPattern {

	public static void main(String[] args) {
		
		// Get the only object available
		SingleObject object = SingleObject.getInstance();

		// show the message
		object.showMessage();
	}

}

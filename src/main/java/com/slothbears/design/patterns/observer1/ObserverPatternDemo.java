package com.slothbears.design.patterns.observer1;

/*
 * Observer pattern uses three actor classes. 
 * Subject, Observer and Client. 
 * Subject is an object having methods to attach and detach observers to a client object. 
 * We have created an abstract class Observer and a concrete class Subject that is extending class Observer.
 * 
 */
public class ObserverPatternDemo {

	public static void main(String[] args) {

		Subject subject = new Subject();

		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);

		System.out.println("First state change: 15");
		subject.setState(15);
		System.out.println("Second state change: 10");
		subject.setState(10);
	
	}

}

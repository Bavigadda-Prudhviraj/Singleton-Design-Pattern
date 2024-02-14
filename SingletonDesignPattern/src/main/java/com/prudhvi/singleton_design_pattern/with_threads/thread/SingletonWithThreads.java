package com.prudhvi.singleton_design_pattern.with_threads.thread;
import java.util.concurrent.locks.ReentrantLock;

public class SingletonWithThreads {
	public static SingletonWithThreads instance = null;
	static ReentrantLock lock = new ReentrantLock();
	private SingletonWithThreads() {}
	//for multi-threaded environments we are using the lock here to give access to the threads
	public static SingletonWithThreads getInstance() {
		if(instance == null) {
			lock.lock();
			instance = new SingletonWithThreads(); 
			lock.unlock();
		}
		return instance;
	}
	/**
	But in this method there is a problem 
		1.when two threads checks if condition and null and if the instances in not initialize
		2.Both enters into the loop and one thread acquires lock and creates an object
		3.After that another thread got locked another thread gets lock and creates another object
		  Note:- here the violate the Singleton design principle.because it is creating two objects 
		5.So,to overcome this problem we are shifts methods lock and unlock outside the if condition
	 */

}

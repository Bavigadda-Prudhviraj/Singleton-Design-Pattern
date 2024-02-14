package com.prudhvi.singleton_design_pattern.with_threads.withLock_not_threadsafe;

import java.util.concurrent.locks.ReentrantLock;

public class SingletonBetteWithThreads {
	public static SingletonBetteWithThreads instance = null;
	static ReentrantLock lock = new ReentrantLock();
	private SingletonBetteWithThreads() {}
	//for multi-threaded environments we are using the lock here to give access to the threads
	public static SingletonBetteWithThreads getInstance() {
		lock.lock();
		if(instance == null) {
			instance = new SingletonBetteWithThreads(); 
		}
		lock.unlock();
		return instance;
	}
	/**
	here we are using lock with thread, But problem is
	1.when we are dealing with the executors then it will create the problem 
	2.It is not thread safe
	3.We are optimize more by using synchronized kind of lock which is thread safe. 
		
	 */

}

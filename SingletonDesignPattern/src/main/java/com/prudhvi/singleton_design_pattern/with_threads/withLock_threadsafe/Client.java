package com.prudhvi.singleton_design_pattern.with_threads.withLock_threadsafe;

public class Client {

	public static void main(String[] args) {
		Singleton_With_Threadsafe instance = Singleton_With_Threadsafe.getInstance();
		System.out.println(instance);

	}

}

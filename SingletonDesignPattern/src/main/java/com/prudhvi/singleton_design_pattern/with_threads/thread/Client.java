package com.prudhvi.singleton_design_pattern.with_threads.thread;

import java.util.ArrayList;
import java.util.Arrays;

public class Client {
	public static void main(String[] args) {
		SingletonWithThreads intance1 = SingletonWithThreads.getInstance();
		SingletonWithThreads intance2 = SingletonWithThreads.getInstance();
		SingletonWithThreads intance3 = SingletonWithThreads.getInstance();
		SingletonWithThreads intance4 = SingletonWithThreads.getInstance();
		SingletonWithThreads intance5 = SingletonWithThreads.getInstance();
		ArrayList<SingletonWithThreads> allInstances = new ArrayList<>(Arrays.asList(intance1, intance2, intance3, intance4, intance5));
		for (SingletonWithThreads instace: allInstances ) {
			System.out.println(instace);
		}

		

	}
}

package com.prudhvi.singleton_design_pattern.with_threads.withLock_not_threadsafe;

import java.util.ArrayList;
import java.util.Arrays;

public class Client {

	public static void main(String[] args) {
		SingletonBetteWithThreads instance1 = SingletonBetteWithThreads.getInstance();
		SingletonBetteWithThreads instance2 = SingletonBetteWithThreads.getInstance();
		SingletonBetteWithThreads instance3 = SingletonBetteWithThreads.getInstance();
		SingletonBetteWithThreads instance4 = SingletonBetteWithThreads.getInstance();
		ArrayList<SingletonBetteWithThreads> allInstances = new ArrayList<>(Arrays.asList(instance1, instance2, instance3, instance4));
		for (SingletonBetteWithThreads instance: allInstances) {
			System.out.println(instance);
		}
	}

}

package com.prudhvi.singleton_design_pattern.with_threads.withLock;

public class Clinet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonBetteWithThreads instance = SingletonBetteWithThreads.getInstance();
		System.out.println(instance);

	}

}

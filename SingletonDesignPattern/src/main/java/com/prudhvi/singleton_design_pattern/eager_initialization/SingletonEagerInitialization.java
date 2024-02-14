package com.prudhvi.singleton_design_pattern.eager_initialization;

public class SingletonEagerInitialization {
	//Here we are initialization is done when the class in loaded 
	public static SingletonEagerInitialization instance = new SingletonEagerInitialization();
	private   SingletonEagerInitialization() {}
	public static SingletonEagerInitialization getInstance() {
		return  instance;
	}

}

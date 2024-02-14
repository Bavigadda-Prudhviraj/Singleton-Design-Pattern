package com.prudhvi.singleton_design_pattern.eager_initialization;



import java.util.ArrayList;
import java.util.Arrays;


public class Client {

	public static void main(String[] args) {
		SingletonEagerInitialization instance1 = SingletonEagerInitialization.getInstance();
		SingletonEagerInitialization instance2 = SingletonEagerInitialization.getInstance();
		SingletonEagerInitialization instance3 = SingletonEagerInitialization.getInstance();
		SingletonEagerInitialization instance4 = SingletonEagerInitialization.getInstance();
		SingletonEagerInitialization instance5 = SingletonEagerInitialization.getInstance();
		ArrayList<SingletonEagerInitialization> allInstanaces = new ArrayList<>(Arrays.asList(instance1,instance2,instance3,instance4,instance5));
		for (SingletonEagerInitialization instances : allInstanaces) {
			System.out.println(instances);
			
		}
	}

}

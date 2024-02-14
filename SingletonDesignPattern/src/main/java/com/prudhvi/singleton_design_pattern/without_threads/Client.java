package com.prudhvi.singleton_design_pattern.without_threads;

import java.util.ArrayList;
public class Client {

	public static void main(String[] args) {
		//As we made constructor as private we can access that constructor
		//so we are using getInstance method to get the instance
		//if there there is an instance it will create, if instance is there means it will return that directly
		Singleton singletonObj1 = Singleton.getInstance();
		Singleton singletonObj2 = Singleton.getInstance();
		Singleton singletonObj3 = Singleton.getInstance();
		Singleton singletonObj4 = Singleton.getInstance();
		
		ArrayList<Singleton> allSingletonInstance = new ArrayList<>();
		allSingletonInstance.add(singletonObj1);
		allSingletonInstance.add(singletonObj2);
		allSingletonInstance.add(singletonObj3);
		allSingletonInstance.add(singletonObj4);
		
		for(Singleton instances : allSingletonInstance) {
			//here all the instances are referring to the same instance we re not creating the new instances every time;
			System.out.println(instances.toString());
		}
		

	}

}

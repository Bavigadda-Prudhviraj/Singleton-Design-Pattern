package com.prudhviraj.singleton.without_multiThreading;


public class Singleton {
	//here making the instance variable to static because we are accessing the this instance in the static method 
	//The static method can access static variables, can't access the local variables.
	private static Singleton instance = null;
	
	//we made this constructor as private so that user can't create a new object of the class
	private Singleton() {}
	//We made this method public so that it can be access any were
	//We make this as static because we made constructor as private user don't have privilege to create an object of this call to call this method
	//So made this method as static
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}		
		return instance;
	}

	
	

}

package com.prudhvi.singleton_design_pattern.with_threads.withLock_threadsafe;

import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.Arrays;

public class Client {

	public static void main(String[] args) {
		Singleton_With_Threadsafe instance1 = Singleton_With_Threadsafe.getInstance();
		Singleton_With_Threadsafe instance2 = Singleton_With_Threadsafe.getInstance();
		Singleton_With_Threadsafe instance3 = Singleton_With_Threadsafe.getInstance();
		Singleton_With_Threadsafe instance4 = Singleton_With_Threadsafe.getInstance();
		Singleton_With_Threadsafe instance5 = Singleton_With_Threadsafe.getInstance();

		Singleton_With_Threadsafe instance6 = Singleton_With_Threadsafe.getInstace1();
		Singleton_With_Threadsafe instance7 = Singleton_With_Threadsafe.getInstace1();
		Singleton_With_Threadsafe instance8 = Singleton_With_Threadsafe.getInstace1();
		Singleton_With_Threadsafe instance9 = Singleton_With_Threadsafe.getInstace1();

		ArrayList<Singleton_With_Threadsafe> allInstances = new ArrayList<>(Arrays.asList(instance1,instance2, instance3, instance4, instance5, instance6, instance7, instance8, instance9));

		for(Singleton_With_Threadsafe instance: allInstances){
			System.out.println(instance);
		}

	}

}

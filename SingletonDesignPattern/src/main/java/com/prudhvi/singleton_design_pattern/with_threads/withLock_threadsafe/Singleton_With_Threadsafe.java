package com.prudhvi.singleton_design_pattern.with_threads.withLock_threadsafe;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Singleton class with lazy initialization and thread-safety using double-checked locking.
 */
public class Singleton_With_Threadsafe {
    // Volatile keyword ensures that multiple threads handle the instance variable correctly.
    private static volatile Singleton_With_Threadsafe instance = null;
    
    // Lock for synchronization.
    private static final ReentrantLock mutexLock = new ReentrantLock();

    // Private constructor to prevent instantiation from outside.
    private Singleton_With_Threadsafe() {}

    /**
     Use synchronized block inside the if loop and volatile variable Pros:
		1.Thread safety is guaranteed
		2.Client application can pass arguments
		3.Lazy initialization achieved
		4.Synchronization overhead is minimal and applicable only for first few threads when the variable is null.
     */
    public static Singleton_With_Threadsafe getInstance() {
        // Double-checked locking to reduce the overhead of synchronization once the instance is created.
        if (instance == null) {
            // Synchronize only if the instance is not created yet.
            synchronized (mutexLock) {
                // Double-check to ensure that the instance is still null before creating it.
                if (instance == null) {
                    instance = new Singleton_With_Threadsafe();
                }
            }
        }
        return instance;
    }
}


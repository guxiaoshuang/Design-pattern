package com.igen.singleton.model;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestSingleton {
	boolean lock;

	public static void main(String[] args) throws InterruptedException{
		final Set<String> setList = Collections.synchronizedSet(new HashSet<String>());
		final TestSingleton testSingleton = new TestSingleton();
		testSingleton.setLock(true);
		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 100; i++) {
			executorService.execute(new Runnable() {
				@Override
				public void run() {
					while (true) {
						if (!testSingleton.isLock()) {
							Singleton singleton = Singleton.getSingletonBase();
							setList.add(singleton.toString());
							break;
						}

					}

				}
			});

		}
		
		Thread.sleep(5000);
		testSingleton.setLock(false);
        Thread.sleep(5000);
        System.out.println("------并发情况下我们取到的实例------");
        for (String instance : setList) {
            System.out.println(instance);
        }
        executorService.shutdown();

	}

	public boolean isLock() {
		return lock;
	}

	public void setLock(boolean lock) {
		this.lock = lock;
	}

}

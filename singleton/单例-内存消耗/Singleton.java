package com.igen.singleton.model;

/**
 * 
 * @author 作者 GXS
 * @date 创建时间 2018年11月20日 下午4:50:42
 * @description 加锁单例模式 【内存消耗太大】
 */
public class Singleton {
	private static Singleton singletonBase;

	private Singleton() {
	}

	public synchronized static Singleton getSingletonBase() {

		if (singletonBase == null) {
			singletonBase = new Singleton();
		}
		return singletonBase;

	}

}

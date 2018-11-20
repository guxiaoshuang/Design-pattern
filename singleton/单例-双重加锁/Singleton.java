package com.igen.singleton.model;

/**
 * 
 * @author 作者 GXS
 * @date 创建时间 2018年11月20日 下午4:50:42
 * @description 双重加锁单例模式 【有时候也会出现并发问题】
 */
public class Singleton {
	private static Singleton singletonBase;

	private Singleton() {
	}

	public static Singleton getSingletonBase() {

		if (singletonBase == null) {
			synchronized (Singleton.class) {
				if (singletonBase == null) {
					singletonBase = new Singleton();
				}
			}

		}
		return singletonBase;

	}

}

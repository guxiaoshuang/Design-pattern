package com.igen.singleton.model;

/**
 * 
 * @author 作者 GXS
 * @date 创建时间 2018年11月20日 下午4:50:42
 * @description 标准的单例模式 【不考虑并发】
 */
public class Singleton {
	private static Singleton singletonBase;

	private Singleton() {
	}

	public static Singleton getSingletonBase() {

		if (singletonBase == null) {
			singletonBase = new Singleton();
		}
		return singletonBase;

	}

}

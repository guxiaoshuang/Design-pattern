package com.igen.singleton.model;

/**
 * 
 * @author 作者 GXS
 * @date 创建时间 2018年11月20日 下午4:46:58
 * 
 * @description 推荐 
 *              1.Singleton最多只有一个实例。
 *
 *              2.保证了并发访问的情况下，不会发生由于并发而产生多个实例。
 *
 *              3.保证了并发访问的情况下，不会由于初始化动作未完全完成而造成使用了尚未正确初始化的实例。
 */
public class Singleton {

	private Singleton() {
	}

	public static Singleton getSingleton() {
		return SingletonInstance.instance;

	}

	private static class SingletonInstance {
		static Singleton instance = new Singleton();
	}

	public static void main(String[] args) {
		System.out.println(Singleton.getSingleton());
	}

}

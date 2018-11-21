package com.igen;

/**
 * 
 * @author 作者 GXS
 * @date 创建时间 2018年11月21日 下午2:01:44
 * @description 简单工厂
 */
public class SimpleFactoryModel {

	private SimpleFactoryModel() {
	}

	public static Product getProduct(String productName) {
		if (("A").equals(productName)) {
			return new ProductA();
		} else if (("B").equals(productName)) {
			return new ProductB();
		} else {
			return null;
		}

	}

}

// 抽象产品
interface Product {
}

// 具体产品
class ProductA implements Product {
}

class ProductB implements Product {
}

// 工厂类


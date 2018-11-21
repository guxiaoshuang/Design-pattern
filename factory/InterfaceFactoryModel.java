package com.igen;

/**
 * 
 * @author 作者 GXS
 * @date 创建时间 2018年11月21日 下午2:01:44
 * @description 抽象工厂模型
 */
public class InterfaceFactoryModel {

}

// 抽象产品
interface Product {
}

// 抽象产品
interface Product1 {
}

// 具体产品
class ProductA implements Product {
}

class ProductB implements Product {
}

// 具体产品
class ProductA1 implements Product1 {
}

class ProductB1 implements Product1 {
}

// 工厂类
interface Factory {
	Product getProduct();

	Product1 getProduct1();
}

class FactoryA implements Factory {

	@Override
	public Product getProduct() {
		return new ProductA();
	}

	@Override
	public Product1 getProduct1() {
		return new ProductA1();
	}

}

class FactoryB implements Factory {

	@Override
	public Product getProduct() {
		return new ProductB();
	}

	@Override
	public Product1 getProduct1() {
		return new ProductB1();
	}

}
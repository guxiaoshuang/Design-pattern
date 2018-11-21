package com.igen;

/**
 * 
 * @author 作者 GXS
 * @date 创建时间 2018年11月21日 下午2:01:44
 * @description 工厂模型
 */
public class FactoryModel {

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
interface Factory {
	Product getProduct();
}

class FactoryA implements Factory {

	@Override
	public Product getProduct() {
		return new ProductA();
	}

}

class FactoryB implements Factory {

	@Override
	public Product getProduct() {
		return new ProductB();
	}

}
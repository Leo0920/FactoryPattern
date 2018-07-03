package com.cn.liangcs.factory;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ProductFactory ProductFactory = new ProductFactory();
		// 获取Circle对象，并调用其draw()
		Product product1 = ProductFactory.getProduct("Phone");
		product1.draw();
		// 获取Retangle对象，并调用其draw()
		Product product2 = ProductFactory.getProduct("Television");
		product2.draw();
		// 获取Square对象，并调用其draw()
		Product product3 = ProductFactory.getProduct("Fridge");
        product3.draw();
	}
}

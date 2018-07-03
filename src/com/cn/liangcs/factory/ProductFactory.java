package com.cn.liangcs.factory;

/**
 * @author liangcs
 * @createTime
 *
 */
public class ProductFactory {

	public Product getProduct (String productType) {
		if(productType == null) {
			return null;
		}
		if(productType.equalsIgnoreCase("Mobile")) {
			return new Mobile();
		}else if(productType.equalsIgnoreCase("Fridge")){
			return new Fridge();
		}else if(productType.equalsIgnoreCase("Television")) {
			return new Television();
		}
		return null;
		
	}
	
}

package org.sl.shop.testcase;

import org.junit.Test;
import org.sl.shop.SpringMVCUnitTestBase;

public class TestCase4mvc extends SpringMVCUnitTestBase {
	
	@Test
	public void test(){
		Object obj = super.getApplicationContext().getBean("purchaseOrderService");
		System.out.println(obj.getClass()+"::"+(obj!=null));
	}

}

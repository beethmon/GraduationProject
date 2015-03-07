package org.sl.shop.testcase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.sl.shop.model.Commodity;
import org.sl.shop.service.CommodityService;
import org.sl.shop.service.PurchaseOrderService;
import org.sl.shop.service.SalesOrderService;
import org.sl.shop.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:conf/root-context.xml" })
public class ServiceTest {
	
	@Autowired
	CommodityService commodityService;

    @Test
    public void testCommodity(){
    	System.out.println("测试CommodityService");
    	System.out.println(commodityService==null);
        List<Commodity> list = (List<Commodity>)this.commodityService.getCommodity(null);

    }
    

}

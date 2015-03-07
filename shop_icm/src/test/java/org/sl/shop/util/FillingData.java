package org.sl.shop.util;


import java.util.Set;


import org.junit.Test;
import org.junit.runner.RunWith;

import org.sl.shop.model.SalesOrder;
import org.sl.shop.service.CommodityService;
import org.sl.shop.service.SalesOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 为了方便使用spring环境进行导入数据 这里使用了测试环境来进行数据导入
 * 同时也算是进行插入测试
 * @author godoway
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:conf/root-context.xml" })
public class FillingData {
	//注入mapper 进行数据填充
//	@Autowired
//	CommodityMapper cMapper;
	@Autowired
    CommodityService commodityService;
    @Autowired
    SalesOrderService salesOrderService;

	//已经执行 封印 不再执行
//	@Test
	public void generateCommodityAndInsert(){
		DataGenerater dg = new DataGenerater();
//		Set<String> set = dg.generateFool(300);
		Set<String> set = dg.generateFool(0);
		for(String cname:set){
//			cMapper.addCommodity(dg.genrateCommodity(cname));
		}
	}
    //已经执行 封印 不再执行
    @Test
    public void generateSalesOrderAndInsert(){
        DataGenerater dg = new DataGenerater();
        for (int i = 0; i < 20; i++) {
            SalesOrder so = dg.genrateSalesOrder(this.commodityService);
            System.out.println(so.getItems().size());
            salesOrderService.addSalesOrder(so);
            System.out.println(so);
        }
    }


}

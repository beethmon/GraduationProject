package org.sl.shop.util;

import java.util.List;
import java.util.Random;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.sl.shop.mapper.CommodityMapper;
import org.sl.shop.mapper.PurchaseOrderItemMapper;
import org.sl.shop.mapper.PurchaseOrderMapper;
import org.sl.shop.mapper.RefundMapper;
import org.sl.shop.mapper.SalesOrderItemMapper;
import org.sl.shop.mapper.SalesOrderMapper;
import org.sl.shop.mapper.StaffMapper;
import org.sl.shop.mapper.StockMapper;
import org.sl.shop.mapper.SupplierMapper;
import org.sl.shop.mapper.UserMapper;
import org.sl.shop.model.Commodity;
import org.sl.shop.model.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 为了方便使用spring环境进行导入数据 这里使用了测试环境来进行数据导入
 * @author godoway
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:conf/root-context.xml" })
public class FillingData {
	//注入mapper 进行数据填充
	@Autowired
	CommodityMapper cMapper;
	@Autowired
	SupplierMapper spMapper;
	@Autowired
	PurchaseOrderMapper poMapper;
	@Autowired
	PurchaseOrderItemMapper poiMapper;
	@Autowired
	SalesOrderMapper soMapper;
	@Autowired
	SalesOrderItemMapper soiMapper;
	@Autowired
	RefundMapper rdMapper;
	@Autowired
	StockMapper skMapper;
	@Autowired
	StaffMapper sfMapper;
	@Autowired
	UserMapper uMapper;
	
	//已经执行
	@Test
	public void generateCommodityAndInsert(){
		DataGenerater dg = new DataGenerater();
//		Set<String> set = dg.generateFool(300);
		//封印 不再执行
		Set<String> set = dg.generateFool(0);
		for(String cname:set){
			//cMapper.addCommodity(dg.genrateCommodity(cname));
		}
	}
	
	@Test
	public void generateStock(){
		List<Commodity> list = cMapper.getCommodity(new Commodity());
		Stock stock = new Stock();
		Random rand = new Random();
		for(Commodity comm : list){
			stock.setComm(comm);
			int num = (int)(rand.nextDouble()*500+50);
			stock.setNum(num);
			skMapper.addStock(stock);
		}
	}
}

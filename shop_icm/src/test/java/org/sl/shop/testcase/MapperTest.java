package org.sl.shop.testcase;


import java.util.List;

import org.junit.Test;
import org.sl.shop.SpringUnitTestBase;
import org.sl.shop.mapper.CommodityMapper;
import org.sl.shop.mapper.SupplierMapper;
import org.sl.shop.model.Commodity;
import org.sl.shop.model.Supplier;
import org.sl.shop.util.Range;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

public class MapperTest extends SpringUnitTestBase{
	
	public MapperTest() {
		super("classpath*:conf/root-context.xml");
	}
	
	@Test
	public void testCommodity(){
		System.out.println("=============================================");
		PageHelper.startPage(1, 5);
		CommodityMapper cMapper =(CommodityMapper)super.getBean("commodityMapper");
		Commodity comm = new Commodity();
		comm.setSales_price(2.5);
		comm.setCname("雪碧");
		comm.setState(Commodity.ACTIVE);
		List<Commodity> list = cMapper.getCommodity(null);
		for(Commodity tmp:list){
			System.out.println(tmp);
		}
		System.out.println("=============================================");
	}
	
	@Test
	public void testSupplier(){
		System.out.println("=============================================");
		SupplierMapper sMapper = (SupplierMapper)super.getBean("supplierMapper");
		Supplier supp = new Supplier();
		supp.setSpid(1);
		List<Supplier> list = sMapper.getSupplierAll(supp);
		for(Supplier tmp : list){
			System.out.println(tmp);
		}
		System.out.println("=============================================");
	}
	
	@Test
	public void testPage(){
		CommodityMapper cMapper =(CommodityMapper)super.getBean("commodityMapper");
		PageHelper.startPage(1, 5);
		Commodity comm = new Commodity();
//		IntervalPrice price = new IntervalPrice(2,8);
//		comm.setIntervalPrice(price);
		Range queryRange = new Range();
		queryRange.setColname("sales_price");
		queryRange.setPrefix("3.00");
		queryRange.setSuffix("8.00");
		comm.setQueryRange(queryRange);
		Page<Commodity> p =  (Page<Commodity>) cMapper.getCommodity(comm);
		System.out.println(p.getPages());
		for(Commodity tmp:p){
			System.out.println(tmp);
		}
		
	}
	
}

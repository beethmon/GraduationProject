package org.sl.shop.testcase;


import java.util.List;

import org.junit.Test;
import org.sl.shop.SpringUnitTestBase;
import org.sl.shop.mapper.CommodityMapper;
import org.sl.shop.mapper.SupplierMapper;
import org.sl.shop.model.Commodity;
import org.sl.shop.model.Supplier;

public class MapperTest extends SpringUnitTestBase{
	
	public MapperTest() {
		super("classpath*:conf/root-context.xml");
	}
	
	@Test
	public void testCommodity(){
		System.out.println("=============================================");
		CommodityMapper cMapper =(CommodityMapper)super.getBean("commodityMapper");
		Commodity comm = new Commodity();
		comm.setSales_price(2.5);
		comm.setCname("雪碧");
		comm.setState(Commodity.ACTIVE);
		List<Commodity> list = cMapper.getCommodity(comm);
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
		Supplier st = list.get(0);
		Supplier st2 = st.getOrders().get(0).getSupplier();
		System.out.println("////"+st.hashCode()+"::"+st2.hashCode());
		System.out.println("=============================================");
	}
	
}

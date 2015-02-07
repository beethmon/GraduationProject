package org.sl.shop.testcase;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sl.shop.SpringUnitTestBase;
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

import com.github.pagehelper.PageHelper;

public class QueryTest extends SpringUnitTestBase{
	
	public QueryTest() {
		super("classpath*:conf/root-context.xml");
		
	}
	
	CommodityMapper cMapper;
	SupplierMapper spMapper;
	PurchaseOrderMapper poMapper;
	PurchaseOrderItemMapper poiMapper;
	SalesOrderMapper soMapper;
	SalesOrderItemMapper soiMapper;
	RefundMapper rdMapper;
	StockMapper skMapper;
	StaffMapper sfMapper;
	UserMapper uMapper;
	
	
	@Test
	public void testCommodity(){
		this.cMapper = super.getBean("commodityMapper");
		this.spMapper = super.getBean("supplierMapper");
		this.poMapper = super.getBean("purchaseOrderMapper");
		this.poiMapper = super.getBean("purchaseOrderItemMapper");
		this.soMapper = super.getBean("salesOrderMapper");
		this.soiMapper = super.getBean("salerOrderItemMapper");
		this.rdMapper = super.getBean("refundMapper");
		this.skMapper = super.getBean("stockMaper");
		this.sfMapper = super.getBean("staffMapper");
		this.uMapper = super.getBean("userMapper");
		System.out.println("===========================");
		System.out.println("commodityMapper");
		
	}
	
}

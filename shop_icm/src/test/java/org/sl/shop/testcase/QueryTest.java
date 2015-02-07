package org.sl.shop.testcase;

import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

import org.junit.Test;
import org.sl.shop.CommonUtil;
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
import org.sl.shop.model.Commodity;
import org.sl.shop.model.PurchaseOrder;
import org.sl.shop.model.PurchaseOrderItem;
import org.sl.shop.model.Refund;
import org.sl.shop.model.SalesOrder;
import org.sl.shop.model.SalesOrderItem;
import org.sl.shop.model.Staff;
import org.sl.shop.model.Stock;
import org.sl.shop.model.Supplier;
import org.sl.shop.model.User;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;

public class QueryTest extends SpringUnitTestBase {

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
	public void testCommodity() {
		this.cMapper = (CommodityMapper)super.getBean("commodityMapper");
		System.out.println("===========================\n");
		System.out.println("CommodityMapper");
		List<Commodity> list = this.cMapper.getCommodity(null);
		if (list.size() > 0){
			System.out.println(beanToJson(list.get(0)));
		}else{
			System.out.println("is null");
		}
		System.out.println("\n===========================");
	}
	
	@Test
	public void testSupplier() {
		this.spMapper = (SupplierMapper)super.getBean("supplierMapper");
		System.out.println("===========================\n");
		System.out.println("SupplierMapper");
		List<Supplier> list = this.spMapper.getSupplier(null);
		if (list.size() > 0){
			System.out.println(beanToJson(list.get(0)));
		}else{
			System.out.println("is null");
		}
		System.out.println("\n===========================");
	}
	
	@Test
	public void testPurchaseOrder() {
		this.poMapper = (PurchaseOrderMapper)super.getBean("purchaseOrderMapper");
		System.out.println("===========================\n");
		System.out.println("PurchaseOrderMapper");
		List<PurchaseOrder> list = this.poMapper.getPurchaseOrder(null);
		if (list.size() > 0){
			System.out.println(beanToJson(list.get(0)));
		}else{
			System.out.println("is null");
		}
		System.out.println();
		System.out.println("\n===========================");
	}
	
	@Test
	public void testPurchaseOrderItem() {
		this.poiMapper = (PurchaseOrderItemMapper)super.getBean("purchaseOrderItemMapper");
		System.out.println("===========================\n");
		System.out.println("PurchaseOrderItemMapper");
		List<PurchaseOrderItem> list = this.poiMapper.getPurchaseOrderItem(null);
		if (list.size() > 0){
			System.out.println(beanToJson(list.get(0)));
		}else{
			System.out.println("is null");
		}
		System.out.println();
		System.out.println("\n===========================");
	}
	
	@Test
	public void testSalesOrder() {
		this.soMapper = (SalesOrderMapper)super.getBean("salesOrderMapper");
		System.out.println("===========================\n");
		System.out.println("SalesOrderMapper");
		List<SalesOrder> list = this.soMapper.getSalesOrder(null);
		if (list.size() > 0){
			System.out.println(beanToJson(list.get(0)));
		}else{
			System.out.println("is null");
		}
		System.out.println();
		System.out.println("\n===========================");
	}
	
	@Test
	public void testSalesOrderItem() {
		this.soiMapper = (SalesOrderItemMapper)super.getBean("salesOrderItemMapper");
		System.out.println("===========================\n");
		System.out.println("SalesOrderItemMapper");
		List<SalesOrderItem> list = this.soiMapper.getSalesOrderItem(null);
		if (list.size() > 0){
			System.out.println(beanToJson(list.get(0)));
		}else{
			System.out.println("is null");
		}
		System.out.println();
		System.out.println("\n===========================");
	}
	
	@Test
	public void testRefund() {
		this.rdMapper = (RefundMapper)super.getBean("refundMapper");
		System.out.println("===========================\n");
		System.out.println("RefundMapper");
		List<Refund> list = this.rdMapper.getRefund(null);
		if (list.size() > 0){
			System.out.println(beanToJson(list.get(0)));
		}else{
			System.out.println("is null");
		}
		System.out.println();
		System.out.println("\n===========================");
	}
	
	@Test
	public void testStock() {
		this.skMapper = (StockMapper)super.getBean("stockMapper");
		System.out.println("===========================\n");
		System.out.println("StockMapper");
		List<Stock> list = this.skMapper.getStock(null);
		if (list.size() > 0){
			System.out.println(beanToJson(list.get(0)));
		}else{
			System.out.println("is null");
		}
		System.out.println();
		System.out.println("\n===========================");
	}
	
	@Test
	public void testStaff() {
		this.sfMapper = (StaffMapper)super.getBean("staffMapper");
		System.out.println("===========================\n");
		System.out.println("StaffMapper");
		List<Staff> list = this.sfMapper.getStaff(null);
		if (list.size() > 0){
			System.out.println(beanToJson(list.get(0)));
		}else{
			System.out.println("is null");
		}
		System.out.println();
		System.out.println("\n===========================");
	}
	
	@Test
	public void testUser() {
		this.uMapper = (UserMapper)super.getBean("userMapper");
		System.out.println("===========================\n");
		System.out.println("UserMapper");
		List<User> list = this.uMapper.getAllUser(null);
		if (list.size() > 0){
			System.out.println(beanToJson(list.get(0)));
		}else{
			System.out.println("is null");
		}
		System.out.println();
		System.out.println("\n===========================");
	}

	/////////////////////////////////////////////////////////////

	public static String beanToJson(Object obj) {
		// 这里异常都未进行处理，而且流的关闭也不规范。开发中请勿这样写，如果发生异常流关闭不了
		ObjectMapper mapper = CommonUtil.getMapperInstance(false);
		JsonGenerator gen;
		String json = "json is null";
		try {
			StringWriter writer = new StringWriter();
			gen = new JsonFactory().createGenerator(writer);
			mapper.writeValue(gen, obj);
			gen.close();
			json = writer.toString();
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
		}
		return json;
	}

}

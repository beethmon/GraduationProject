package org.sl.shop.testcase;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.sl.shop.model.Commodity;
import org.sl.shop.model.PurchaseOrder;
import org.sl.shop.model.PurchaseOrderItem;
import org.sl.shop.model.Supplier;
import org.sl.shop.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 插入进货单数据
 * 
 * @author Howard Rowe
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:conf/root-context.xml" })
public class PurchaseOrderInsterTest {
	
	//数据库字段
	//PurchaseOrder.java
	//进货表自增id
	private int poid;
	//进货商店id
	private Supplier spid;
	//随机字符串
	private String bno;
	//进货项目商品单价
	private List<PurchaseOrderItem> items;
	//进货时间
	private Date poDate;
	//进货总额
	private double pSum;
	//进货状态
	private int state;
	//PurchaseOrderItem.java
	//进货单产品自增id
	private int poiid;
	//商品类
	private Commodity comm;
	//单产品数量
	private double num;
	//单产品单价
	private double unitPrice;
	//单产品总价
	private double pISum;
	//单产品进货时间目前等价于poDate
	private Date poiDate;
	//Commodity.java
	//商品自增id
	private int cid;
	//商品名
	private String cname;
	//商品单价
	private double sales_price;
	//商品预留字串
	private String about;
	//商品预留字串
	private String path;
	//商品状态
	private int cState;
	//商品随机码
	private String ccodes;
	
	//获得所有商品
	@Autowired
	CommodityService commodityService;
//	Commodity commodity = new Commodity();
//	List<Commodity> listCommodity = getCommodity(commodity);
	@Test
	public void getCommodity() {
		// TODO Auto-generated method stub
		Commodity commodity = new Commodity();
		List<Commodity> temp = commodityService.getCommodity(commodity);
		System.out.print("获得的商品数量" + temp.size());
//		return temp;
	}
	
	

}

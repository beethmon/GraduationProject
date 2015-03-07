package org.sl.shop.testcase;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

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
	private int spid[] = {4,5,6,7,8};
	//bno字符串
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
	/**
	 * 随机字串
	 */

	/**我丢你咩怒删
	final String word[] = {"a","b","c","d","e","f",
	                       "g","h","i","j","k","l",
	                       "m","n","o","p","q","r",
	                       "s","t","u","v","w","x",
	                       "y","z",};
    final String m[] = {"itg","ngt","sng","sgt",
	                    "ggt","rkg","stg","htg",
	                    "kgt","jug","jui","jun"};
    final String w[] = {"nyb","gyb","kyb","syb","myb","kyb","dyb"};
	static int i = 0;
	static int j = 0;
	 *
	 * 取得字符串
	 *
//	@Test
	public void getBNo(){
		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT+8:00"));
		int month = calendar.get(Calendar.MONTH);
		int week = calendar.get(Calendar.DAY_OF_WEEK) - 1;
		int day = calendar.get(Calendar.DAY_OF_MONTH) - 1;
		String temp = "";
		String temp2 = "";
		if(day < 10){
			temp = word[(int) (Math.random() * 26)] + word[(int) (Math.random() * 26)] + word[day];
		}else{
			temp = word[(int) (Math.random() * 26)] + word[(int) (day / 10)] + word[day % 10];
		}		
		int second = calendar.get(Calendar.SECOND);
		if(i >= 26){
			i = 0;
		}
		if(j >= 10){
			j = 0;
		}
		if(second < 10){
			temp2 = word[i] + "0" + j + second;
		}else{
			temp2 = word[i] + j + second;
		}
		String tempBno = "";
		tempBno = m[month] + temp + w[week] + temp2;
		System.out.println("bno为" + tempBno);
		//最后记得++
		i++;
		j++;

	}
	**/
	//获得所有商品
	@Autowired
	CommodityService commodityService;
//	Commodity commodity = new Commodity();
//	List<Commodity> listCommodity = getCommodity(commodity);
//	@Test
	/**
	 * 取得商品列表
	 */
	public void getCommodity() {
		// TODO Auto-generated method stub
		Commodity commodity = new Commodity();
		List<Commodity> temp = commodityService.getCommodity(commodity);
		System.out.print("获得的商品数量" + temp.size());
//		return temp;
	}
	
	

}

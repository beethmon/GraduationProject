package org.sl.shop.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import org.apache.commons.lang.RandomStringUtils;
import org.sl.shop.model.Commodity;
import org.sl.shop.model.SalesOrder;
import org.sl.shop.model.SalesOrderItem;
import org.sl.shop.service.CommodityService;

public class DataGenerater {
	// 食物组合元素
	private static String[] preFNames = { "家园", "美味", "嘉顿", "普通的", "雀巢", "乐派",
			"五洲", "艾萨克", "鲜味", "徐福记", "大家乐", "姥姥家", "大哥大", "乐呵呵", "思源" };
	private static String[] cFNames = { "饼干", "汽水", "蛋糕", "薯条", "薯片", "威化饼",
			"牛奶", "酸奶", "瓜子", "巧克力", "咖啡", "雪糕", "冰棍", "甜筒", "面包", "花生", "奇妙豆",
			"糖果", "巴菲" };
	private static String[] sufFNames = { "(西瓜味)", "(草莓味)", "(巧克力味)", "(薄荷味)",
			"(黄瓜味)", "(芥末味)", "(咖喱味)", "", "(香草味)", "(麻辣)", "(香蕉味)", "(香芋)",
			"(菠萝味)", "(芒果味)", "(哈密瓜味)" };

	private Random rand;
    private List<Commodity> list;


	public Set<String> generate(String[] pre, String[] context, String[] suf,
			int num) {
		int perNum = pre.length;
		int cNum = context.length;
		int sufNum = suf.length;
		StringBuffer sb = new StringBuffer();
		Set<String> fools = new TreeSet<String>();
		// 索引
		int index = 0;
		for (int i = 0; i < num; i++) {
			// 字符串拼接
			sb.setLength(0);
			index = (int) (rand.nextDouble() * perNum);
			sb.append(pre[index]);
			index = (int) (rand.nextDouble() * cNum);
			sb.append(context[index]);
			index = (int) (rand.nextDouble() * sufNum);
			sb.append(suf[index]);
			fools.add(sb.toString());
			// System.out.println(sb.toString());
		}
		System.out.println(fools.size());
		return fools;
	}

	public Set<String> generateFool(int num) {
		return generate(preFNames, cFNames, sufFNames, num);
	}

	public Commodity genrateCommodity(String cname) {
		Commodity c = new Commodity();
		c.setCname(cname);
		double sales_price = (double) (Math.round(rand.nextFloat() * 15 * 100) / 100.0);
		c.setSales_price(sales_price);
		Random rd = new Random(cname.hashCode());
		long ccodes = (long) (10000000000000L * rd.nextDouble());
		c.setCcodes(String.format("%013d", ccodes));
		c.setState(Commodity.ACTIVE);
        int num = (int)(rand.nextDouble()*500+50);
        c.setNum(num);
		// System.out.println(c);
		return c;
	}

    public SalesOrder genrateSalesOrder(CommodityService cs){
        Random rd = new Random();
        SalesOrder s = new SalesOrder();
        List<SalesOrderItem> items = new ArrayList<SalesOrderItem>();
        //随机bno
        s.setBno(RandomStringUtils.randomAlphanumeric(10));
        if(this.list==null)
            this.list = new ArrayList<Commodity>();
        if(this.list.isEmpty())
            this.list = cs.getCommodity(null);
        int cNum = list.size();
        int itemNum = rd.nextInt(10)+2;
        for (int i = 0; i < itemNum; i++) {
            Commodity c = list.get(rd.nextInt(cNum));
            SalesOrderItem soi = new SalesOrderItem();
            soi.setComm(c);
            soi.setNum(rd.nextInt(itemNum)+1);
            items.add(soi);
        }
        s.setItmes(items);
        return s;
    }
}

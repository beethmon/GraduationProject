package org.sl.shop.util;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import org.sl.shop.model.Commodity;

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

	public DataGenerater() {
		this.rand = new Random();

	}

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
		// System.out.println(c);
		return c;
	}

}

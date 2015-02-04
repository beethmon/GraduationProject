package org.sl.shop.util;

public class Orderby {
	public static final String ASC = "ASC";
	public static final String DESC = "DESC";

	private String orderby;
	private String colname;

	public String getOrderby() {
		return orderby;
	}
	
	/**
	 * 只允许使用 
	 * Orderby.ASC = "ASC" 或 Orderby.DESC = "DESC"
	 * @param orderby
	 */
	public void setOrderby(String orderby) {
		if (orderby.equals(ASC) || orderby.equals(DESC))
			this.orderby = orderby;
	}

	public String getColname() {
		return colname;
	}
	
	/**
	 * 设置要排列的字段
	 * @param column
	 */
	public void setColname(String colname) {
		this.colname = colname;
	}

}

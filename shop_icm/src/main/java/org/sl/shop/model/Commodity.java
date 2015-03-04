package org.sl.shop.model;


import org.sl.shop.util.QueryExtra;

/**
 * 产品
 * 
 * @author godoway
 *
 */
public class Commodity extends QueryExtra{
	public static final int ACTIVE = 1;
	public static final int NEGATIVE = -1;

	private int cid;
	// private Supplier supplier;
	private String cname;
	private double sales_price;
	private String about;
	private String path;
	private int state;
	private String ccodes;
	private double num;
	

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	// public Supplier getSupplier() {
	// return supplier;
	// }
	//
	// public void setSupplier(Supplier supplier) {
	// this.supplier = supplier;
	// }

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public double getSales_price() {
		return sales_price;
	}

	public void setSales_price(double sales_price) {
		this.sales_price = sales_price;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getCcodes() {
		return ccodes;
	}

	public void setCcodes(String ccodes) {
		this.ccodes = ccodes;
	}
	
	public double getNum() {
		return num;
	}

	public void setNum(double num) {
		this.num = num;
	}

	@Override
	public String toString() {
		// String strSupplier = supplier != null ? supplier.toString() : "null";
		String strCname = cname != null ? ("\"" + cname + "\"") : "null";
		String strAbout = about != null ? ("\"" + about + "\"") : "null";
		String strPath = path != null ? ("\"" + path + "\"") : "null";
		return "{cid:" + cid + ",cname:" + strCname + ",sales_price:"
				+ sales_price + ",about:" + strAbout + ",path:" + strPath
				+ ",state:" + state +",ccodes:"+ccodes+ "}";
	}

}

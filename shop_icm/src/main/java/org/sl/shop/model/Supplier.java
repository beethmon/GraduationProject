package org.sl.shop.model;

import java.util.List;

/**
 * 供货商
 * 
 * @author godoway
 *
 */
public class Supplier {
	private int spid;
	private String spname;
	private String address;
	private String contact;
	private String about;
	// private List<Commodity> commodities;
	private List<PurchaseOrder> orders;

	public int getSpid() {
		return spid;
	}

	public void setSpid(int spid) {
		this.spid = spid;
	}

	public String getSpname() {
		return spname;
	}

	public void setSpname(String spname) {
		this.spname = spname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	// public List<Commodity> getCommodities() {
	// return commodities;
	// }
	//
	// public void setCommodities(List<Commodity> commodities) {
	// this.commodities = commodities;
	// }

	public List<PurchaseOrder> getOrders() {
		return orders;
	}

	public void setOrders(List<PurchaseOrder> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "{spid:" + spid + ", spname:" + spname + ", address:" + address
				+ ", contact:" + contact + ", about:" + about + ", orders:"
				+ orders + "}";
	}

}

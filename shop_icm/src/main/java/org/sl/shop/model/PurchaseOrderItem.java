package org.sl.shop.model;


import java.util.Date;

import org.sl.shop.util.QueryExtra;

public class PurchaseOrderItem extends QueryExtra {
	private int poiid;
	private PurchaseOrder purchaseOrder;
	private Commodity comm;
	private double num;
	private double unitPrice;
	private double sum;
	private Date poiDate;

	public int getPoiid() {
		return poiid;
	}

	public void setPoiid(int poiid) {
		this.poiid = poiid;
	}

	public PurchaseOrder getPurchaseOrder() {
		return purchaseOrder;
	}

	public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}

	public Commodity getComm() {
		return comm;
	}

	public void setComm(Commodity comm) {
		this.comm = comm;
	}

	public double getNum() {
		return num;
	}

	public void setNum(double num) {
		this.num = num;
	}


	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public Date getPuDate() {
		return poiDate;
	}

	public void setPuDate(Date poiDate) {
		this.poiDate = poiDate;
	}

}

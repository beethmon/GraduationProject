package org.sl.shop.model;

import java.math.BigDecimal;
import java.util.Date;

public class PurchaseOrderItem {
	private int poiid;
	private PurchaseOrder purchaseOrder;
	private Commodity comm;
	private BigDecimal num;
	private BigDecimal unitPrice;
	private BigDecimal sum;
	private Date puDate;

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

	public BigDecimal getNum() {
		return num;
	}

	public void setNum(BigDecimal num) {
		this.num = num;
	}

	public void setNum(int num) {
		this.num = new BigDecimal(num);
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public BigDecimal getSum() {
		return sum;
	}

	public void setSum(BigDecimal sum) {
		this.sum = sum;
	}

	public Date getPuDate() {
		return puDate;
	}

	public void setPuDate(Date puDate) {
		this.puDate = puDate;
	}

}

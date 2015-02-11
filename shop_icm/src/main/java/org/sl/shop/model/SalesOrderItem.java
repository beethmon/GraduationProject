package org.sl.shop.model;

import java.util.Date;

import org.sl.shop.util.QueryExtra;

public class SalesOrderItem extends QueryExtra {
	private int soiid;
	private SalesOrder salesOrder;
	private Commodity comm;
	private double num;
	private double unitPrice;
	private double sum;
	private Date soiDate;

	public int getSoiid() {
		return soiid;
	}

	public void setSoiid(int soiid) {
		this.soiid = soiid;
	}

	public SalesOrder getSalesOrder() {
		return salesOrder;
	}

	public void setSalesOrder(SalesOrder salesOrder) {
		this.salesOrder = salesOrder;
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

	public Date getSoiDate() {
		return soiDate;
	}

	public void setSoiDate(Date soiDate) {
		this.soiDate = soiDate;
	}

}

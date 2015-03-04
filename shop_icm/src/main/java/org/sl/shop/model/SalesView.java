package org.sl.shop.model;

import java.util.Date;

import org.sl.shop.util.QueryExtra;

public class SalesView extends QueryExtra {
	private Commodity commodity;
	private double num;
	private double sum;
	private double unitPrice;
	private Date soiDate;
	public Commodity getCommodity() {
		return commodity;
	}
	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;
	}
	public double getNum() {
		return num;
	}
	public void setNum(double num) {
		this.num = num;
	}
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Date getSoiDate() {
		return soiDate;
	}
	public void setSoiDate(Date soiDate) {
		this.soiDate = soiDate;
	}
	
}

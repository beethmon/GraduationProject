package org.sl.shop.model;

import java.math.BigDecimal;
import java.util.Date;

import org.sl.shop.util.QueryExtra;

public class SalesOrderItem extends QueryExtra {
	private int soiid;
	private SalesOrder salesOrder;
	private Commodity comm;
	private BigDecimal num;
	private BigDecimal unitPrice;
	private BigDecimal sum;
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

	public BigDecimal getNum() {
		return num;
	}

	public void setNum(BigDecimal num) {
		this.num = num;
	}

	public void setNum(int num) {
		this.num = BigDecimal.valueOf(num);
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

	public Date getSoiDate() {
		return soiDate;
	}

	public void setSoiDate(Date soiDate) {
		this.soiDate = soiDate;
	}

}

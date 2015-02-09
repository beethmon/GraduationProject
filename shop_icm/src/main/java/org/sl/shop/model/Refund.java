package org.sl.shop.model;

import java.math.BigDecimal;
import java.util.Date;

import org.sl.shop.util.QueryExtra;

public class Refund extends QueryExtra {
	private int rid;
	private Commodity comm;
	private BigDecimal num;
	private Date refundDate;
	private BigDecimal refund;

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
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

	public Date getRefundDate() {
		return refundDate;
	}

	public void setRefundDate(Date refundDate) {
		this.refundDate = refundDate;
	}

	public BigDecimal getRefund() {
		return refund;
	}

	public void setRefund(BigDecimal refund) {
		this.refund = refund;
	}

}

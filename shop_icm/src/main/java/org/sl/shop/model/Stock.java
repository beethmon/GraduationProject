package org.sl.shop.model;

import org.sl.shop.util.QueryExtra;

import java.math.BigDecimal;

/**
 * 库存
 * @author godoway
 *
 */
public class Stock extends QueryExtra {
	private Commodity comm;
	private double num;
	
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

}

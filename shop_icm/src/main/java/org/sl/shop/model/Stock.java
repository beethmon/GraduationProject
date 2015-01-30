package org.sl.shop.model;
/**
 * 库存
 * @author godoway
 *
 */
public class Stock {
	private Commodity comm;
	private int num;
	
	public Commodity getComm() {
		return comm;
	}
	public void setComm(Commodity comm) {
		this.comm = comm;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	
}

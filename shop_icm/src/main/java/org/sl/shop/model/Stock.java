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
	private BigDecimal num;
	
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
    public void setNum(int num){
        this.num =BigDecimal.valueOf(num);
    }
	
}

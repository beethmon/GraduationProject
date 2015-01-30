package org.sl.shop.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 销售单
 * 
 * @author godoway
 *
 */
public class SalesOrder {
	int soid;
	private String bno;
	private List<SalesOrderItem> itmes;
	private Date poDate;
	private BigDecimal sum;

	public int getSoid() {
		return soid;
	}

	public void setSoid(int soid) {
		this.soid = soid;
	}

	public String getBno() {
		return bno;
	}

	public void setBno(String bno) {
		this.bno = bno;
	}

	public List<SalesOrderItem> getItmes() {
		return itmes;
	}

	public void setItmes(List<SalesOrderItem> itmes) {
		this.itmes = itmes;
	}

	public Date getPoDate() {
		return poDate;
	}

	public void setPoDate(Date poDate) {
		this.poDate = poDate;
	}

	public BigDecimal getSum() {
		return sum;
	}

	public void setSum(BigDecimal sum) {
		this.sum = sum;
	}

}

package org.sl.shop.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.sl.shop.util.QueryExtra;

/**
 * 销售单
 * 
 * @author godoway
 *
 */
public class SalesOrder extends QueryExtra {
	int soid;
	private String bno;
	private List<SalesOrderItem> items;
	private Date soDate;
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
		return items;
	}

	public void setItmes(List<SalesOrderItem> items) {
		this.items = items;
	}

	public Date getPoDate() {
		return soDate;
	}

	public void setPoDate(Date soDate) {
		this.soDate = soDate;
	}

	public BigDecimal getSum() {
		return sum;
	}

	public void setSum(BigDecimal sum) {
		this.sum = sum;
	}

}

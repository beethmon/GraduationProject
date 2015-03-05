package org.sl.shop.model;

import java.util.Date;
import java.util.List;

import org.sl.shop.util.QueryExtra;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

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
	private double sum;

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

	public List<SalesOrderItem> getItems() {
		return items;
	}

	public void setItmes(List<SalesOrderItem> items) {
		this.items = items;
	}
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")  
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8") 
	public Date getPoDate() {
		return soDate;
	}

	public void setPoDate(Date soDate) {
		this.soDate = soDate;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

}

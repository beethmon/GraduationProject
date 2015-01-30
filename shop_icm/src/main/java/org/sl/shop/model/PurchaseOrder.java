package org.sl.shop.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 采购单
 * 
 * @author godoway
 *
 */
public class PurchaseOrder {
	private int poid;
	private Supplier supplier;
	private String bno;
	private List<PurchaseOrderItem> itmes;
	private Date poDate;
	private BigDecimal sum;

	public int getPoid() {
		return poid;
	}

	public void setPoid(int poid) {
		this.poid = poid;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public String getBno() {
		return bno;
	}

	public void setBno(String bno) {
		this.bno = bno;
	}

	public List<PurchaseOrderItem> getItmes() {
		return itmes;
	}

	public void setItmes(List<PurchaseOrderItem> itmes) {
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

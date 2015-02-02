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

	public static final int SUCCESS = 1;
	public static final int FALI = -1;
	public static final int WATTING = 0;

	private int poid;
	private Supplier supplier;
	private String bno;
	private List<PurchaseOrderItem> items;
	private Date poDate;
	private BigDecimal sum;
	private int state;
	private boolean wait;

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

	public List<PurchaseOrderItem> getItems() {
		return items;
	}

	public void setItems(List<PurchaseOrderItem> items) {
		this.items = items;
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

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public boolean isWait() {
		return wait;
	}

	public void setWait(boolean wait) {
		this.wait = wait;
	}

	
	

}

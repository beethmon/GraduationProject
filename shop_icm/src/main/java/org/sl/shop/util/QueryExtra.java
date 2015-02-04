package org.sl.shop.util;

import java.util.List;

public class QueryExtra {
	private Orderby orderby;
	private Range queryRange;
	private List<String> groupby;

	public Orderby getOrderby() {
		return orderby;
	}

	public void setOrderby(Orderby orderby) {
		this.orderby = orderby;
	}

	public Range getQueryRange() {
		return queryRange;
	}

	public void setQueryRange(Range queryRange) {
		this.queryRange = queryRange;
	}

	public List<String> getGroupby() {
		return groupby;
	}

	public void setGroupby(List<String> groupby) {
		this.groupby = groupby;
	}

}

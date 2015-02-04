package org.sl.shop.util;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class QueryExtra {
	@JsonIgnore
	private Orderby orderby;
	@JsonIgnore
	private Range queryRange;
	@JsonIgnore
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

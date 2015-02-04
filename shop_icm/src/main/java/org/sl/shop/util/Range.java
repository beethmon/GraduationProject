package org.sl.shop.util;

public class Range {
	private String colname;
	private String prefix;
	private String suffix;

	public String getColname() {
		return colname;
	}

	public void setColname(String colname) {
		this.colname = colname;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public void setPrefix(double prefix) {
		this.prefix = String.valueOf(prefix);
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public void setSuffix(double suffix) {
		this.suffix = String.valueOf(suffix);
	}

}

package org.sl.shop.util;

import java.util.List;

/**
 * 把分页数据进行封装
 * 
 * @author godoway
 *
 * @param <T>
 */
public class Page<T> {
	/**
	 * 页码
	 */
	private int pageNum = 1;
	/**
	 * 页面大小
	 */
	private int pageSize = 15;
	/**
	 * 总页数
	 */
	private int totalPage;
	/**
	 * 总数据数
	 */
	private int resultsNum;
	/**
	 * 每页起始行
	 */
	private int offset;
	private T condition;
	/**
	 * 对应页的数据
	 */
	private List<T> results;

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getResultsNum() {
		return resultsNum;
	}
	// 获得总数目的时候计算总页数
	public void setResultsNum(int resultsNum) {
		this.resultsNum = resultsNum;
		int totalPage = resultsNum % pageSize == 0 ? resultsNum / pageSize
				: resultsNum / pageSize + 1;
		setTotalPage(totalPage);
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}
	
	public T getCondition(){
		return condition;
	}
	public void setCondition(T condition){
		this.condition = condition;
	}

	public List<T> getResults() {
		return results;
	}

	public void setResults(List<T> results) {
		this.results = results;
	}

}

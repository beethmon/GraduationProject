package org.sl.shop.model;

import org.sl.shop.util.QueryExtra;

/**
 * 用户
 * 
 * @author godoway
 *
 */
public class User extends QueryExtra {
	
	public static final int NONE = 0;
	public static final int SALES = 1;
	public static final int PURCHASE = 2;
	public static final int MANAGE = 4;
	
	private int uid;
	private String username;
	private String password;
	/**
	 * 取值0-7
	 */
	private int limit;
	private Staff staff;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	public Staff getStaff(){
		return staff;
	}
	
	public void setStaff(Staff staff){
		this.staff = staff;
	}

}

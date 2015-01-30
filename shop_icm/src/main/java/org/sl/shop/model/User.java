package org.sl.shop.model;

/**
 * 用户
 * 
 * @author godoway
 *
 */
public class User {
	private int uid;
	private String username;
	private String password;
	private String limit;
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

	public String getLimit() {
		return limit;
	}

	public void setLimit(String limit) {
		this.limit = limit;
	}
	
	public Staff getStaff(){
		return staff;
	}
	
	public void setStaff(Staff staff){
		this.staff = staff;
	}

}

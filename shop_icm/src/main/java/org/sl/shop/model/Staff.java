package org.sl.shop.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 员工
 * 
 * @author godoway
 *
 */
public class Staff {
	public static final int ACTIVE = 1;
	public static final int NEGATIVE = -1;

	private int staffId;
	private String sname;
	private String gender;
	private Date birth;
	private String post;
	private int isService;
	private BigDecimal salary;

	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public int getIsService() {
		return isService;
	}

	public void setIsService(int isService) {
		this.isService = isService;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public static int getActive() {
		return ACTIVE;
	}

	public static int getNegative() {
		return NEGATIVE;
	}

}

package org.sl.shop.mapper;

import java.util.List;

import org.sl.shop.model.Staff;

public interface StaffMapper {
	public int addStaff(Staff staff);

	public int updateStaff(Staff staff);

	public int deleteStaff(Staff staff);

	public List<Staff> getStaff(Staff staff);
}

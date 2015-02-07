package org.sl.shop.mapper;

import java.util.List;

import org.sl.shop.model.Staff;

public interface StaffMapper {
	public boolean addStaff(Staff staff);

	public int updateStaff(Staff staff);

	public boolean deleteStaff(Staff staff);

	public List<Staff> getStaff(Staff staff);
}

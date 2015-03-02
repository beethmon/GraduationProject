package org.sl.shop.service;

import org.sl.shop.mapper.StaffMapper;
import org.sl.shop.model.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StaffService {
    @Autowired
    private StaffMapper staffMapper;

    @Transactional(readOnly = true)
    public List<Staff> getStaff(Staff staff) {
        return staffMapper.getStaff(staff);
    }

    @Transactional
    public void addStaff(Staff staff) {
        staffMapper.addStaff(staff);
    }

    @Transactional
    public void updateStaff(Staff staff) {
        staffMapper.updateStaff(staff);
    }

    @Transactional
    public boolean deleteStaff(Staff staff) {
        staffMapper.deleteStaff(staff);
        return true;
    }
}

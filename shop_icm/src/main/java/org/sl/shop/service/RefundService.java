package org.sl.shop.service;

import org.sl.shop.mapper.RefundMapper;
import org.sl.shop.model.Refund;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RefundService {

    @Autowired
    public RefundMapper refundMapper;

    @Transactional(readOnly = true)
    public List<Refund> getRefund(Refund refund) {
        return refundMapper.getRefund(refund);
    }

    @Transactional
    public void addRefund(Refund refund) {
        refundMapper.addRefund(refund);
    }

    @Transactional
    public void updateRefund(Refund refund) {
        refundMapper.updateRefund(refund);
    }

    @Transactional
    public boolean deleteRefund(Refund refund) {
        refundMapper.deleteRefund(refund);
        return true;
    }

}

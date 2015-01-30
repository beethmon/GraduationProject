package org.sl.shop.mapper;

import java.util.List;

import org.sl.shop.model.Refund;

public interface RefundMapper {
	public boolean addRefund(Refund refund);
	public int updateRefund(Refund refund);
	public boolean deleteRefund(Refund refund);
	public List<Refund> getRefund(Refund refund);
}

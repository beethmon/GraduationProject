package org.sl.shop.mapper;

import java.util.List;

import org.sl.shop.model.Refund;

public interface RefundMapper {
	public int addRefund(Refund refund);

	public int updateRefund(Refund refund);

	public int deleteRefund(Refund refund);

	public List<Refund> getRefund(Refund refund);
}

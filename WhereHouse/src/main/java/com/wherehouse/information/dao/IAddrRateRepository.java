package com.wherehouse.information.dao;

import org.apache.ibatis.annotations.Param;

import com.wherehouse.information.model.AddrRateVO;

public interface IAddrRateRepository {
	AddrRateVO getRate(@Param("address") String addr);
}

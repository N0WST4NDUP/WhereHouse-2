package com.wherehouse.information.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wherehouse.information.model.PoliceOfficeVO;

public interface IPoliceOfficeRepository {
	List<PoliceOfficeVO> getListPO();
	PoliceOfficeVO getClosestPO(@Param("latitude") double latitude,@Param("longitude") double longitude);
}

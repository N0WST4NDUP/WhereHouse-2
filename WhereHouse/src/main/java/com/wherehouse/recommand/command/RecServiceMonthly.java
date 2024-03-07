package com.wherehouse.recommand.command;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wherehouse.recommand.dao.IRecServiceEmpRepository;
import com.wherehouse.recommand.model.RecServiceDto;

/* 월세 요청 처리 */
@Service
public class RecServiceMonthly implements IRecCommand{

	@Autowired
	IRecServiceEmpRepository RecServiceEmpRepository;
	
	@Override
	public List<RecServiceDto> execute(Map<String, String> requestAjax) {
		
		List<RecServiceDto> RecServiceResult = RecServiceEmpRepository.chooseCharterRec(Integer.parseInt(requestAjax.get("charter_avg")), Integer.parseInt(requestAjax.get("safe_score")),  Integer.parseInt(requestAjax.get("cvt_score")));
		return RecServiceResult;
	}
}
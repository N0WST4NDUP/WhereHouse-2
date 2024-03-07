package com.wherehouse.recommand.command;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.wherehouse.recommand.dao.IRecServiceEmpRepository;
import com.wherehouse.recommand.model.RecServiceDto;

/* 전세금 요청 처리 */
@Service
public class RecServiceCharter implements IRecCommand{

	@Autowired
	IRecServiceEmpRepository recServiceEmpRepository;
	
	@Override
	public List<RecServiceDto> execute(Map <String, String> requestAjax) {
		
		/* 입력받은 데이터를 각 변수안에 삽입. */
		List<RecServiceDto> RecServiceResult = recServiceEmpRepository.chooseCharterRec(Integer.parseInt(requestAjax.get("charter_avg")), Integer.parseInt(requestAjax.get("safe_score")),  Integer.parseInt(requestAjax.get("cvt_score"))); 	/* jdbcTemplate */
		System.out.println("RecServiceCharter in RecServiceResult.size : " + RecServiceResult.size());
		
		return RecServiceResult;
	}
}

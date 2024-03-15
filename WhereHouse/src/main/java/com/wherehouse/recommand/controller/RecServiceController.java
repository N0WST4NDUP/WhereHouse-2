package com.wherehouse.recommand.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wherehouse.recommand.model.RecServiceVO;
import com.wherehouse.recommand.service.IRecService;

/* 월세 및 전세에 대한 AJAX 요청 처리하는 컨트롤러. */

@Controller
@RequestMapping(value="/RecServiceController")
public class RecServiceController {
	
	@PostConstruct
	public void init() {
		System.out.println("컨트롤러 RecServiceController 실행");
	}
	
	@Autowired
	@Qualifier("recServiceCharterService")
	IRecService recServiceCharterService;
	
	@Autowired
	@Qualifier("recServiceMonthlyService")
	IRecService recServiceMonthlyService;
	
	/* 전세 요청 처리 */
	@RequestMapping(value="/charter", method=RequestMethod.POST)
	public @ResponseBody List<RecServiceVO> ControllerRecServiceCharter(@RequestBody Map<String, String>requestAjax) {
		System.out.println("/charter.do 메소드 실행!");
		
		if(requestAjax.get("charter_avg").equals("")) {
			return null;
		} else {
			List<RecServiceVO> RecServiceResult = recServiceCharterService.execute(requestAjax);			/* ServiceBean으로 분기하여 작업 */
			return RecServiceResult;
		}
	}
	
	/* 월세 요청 처리 */
	@RequestMapping(value="/monthly", method=RequestMethod.POST)
	public @ResponseBody List<RecServiceVO> ControllerRecServiceMothly(@RequestBody Map<String, String>requestAjax) {	
		System.out.println("/monthly 메소드 실행 !");
		
		if(requestAjax.get("deposit_avg").equals("")) {
			return null;
		} else {
			List<RecServiceVO> RecServiceResult = recServiceMonthlyService.execute(requestAjax);		/* ServiceBean으로 분기하여 작업 */
			return RecServiceResult;
		}
	}
}
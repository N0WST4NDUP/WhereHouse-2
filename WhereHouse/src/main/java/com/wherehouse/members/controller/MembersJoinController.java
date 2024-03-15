package com.wherehouse.members.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wherehouse.members.service.MemberJoinService;

/* 회원 가입 요청 받는 컨트롤러 */
@Controller
public class MembersJoinController {
	
	@Autowired
	MemberJoinService memberjoinService;
	
	@RequestMapping(value="/joinOk", method=RequestMethod.POST)
	public String joinRequest(HttpServletRequest httpRequest, Model model) {
		System.out.println("joinOk 메소드 실행.");
		
		String resInt = String.valueOf(memberjoinService.ValidJoin(httpRequest));

		model.addAttribute("resInt", resInt);			/* 회원 가입 요청에 필요한 데이터를 전달. */
		
		return "members/joinOk";
	}
}
package com.wherehouse.recommand.controller;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value="/page")
public class PageResponseController  {
	
	@PostConstruct
	public void init() {
		System.out.println("컨트롤러 pageResponse 실행!!");
	}
	
	/* main.jsp 페이지 요청 시 main 페이지 제공 */
	@RequestMapping(value="/main", method=RequestMethod.GET)
	public String pageMain() {
		System.out.println("pageMain  메소드 실행!");
		return "recommand/main";
	}
	
	/* main.jsp 에서 거주지 추천(house_rec.jsp) 페이지 구성 */
	@RequestMapping(value="/houserec", method=RequestMethod.GET)
	public String pageHouserec() {
		System.out.println(("pageHouserec 메소드 실행!"));
		return "recommand/house_rec";
	}
	
	/* main.jsp 에서 gu_map.jsp 구성 */
	@RequestMapping(value="/gumap", method=RequestMethod.GET)
	public String pageGumap() {
		return "recommand/gu_map";
	}
	
	/* main.jsp 에서 gu_map.jsp 구성 */
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String pageList() {
		return "recommand/gu_map";
	}
}
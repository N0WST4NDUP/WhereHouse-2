package com.wherehouse.members.service;

import javax.servlet.http.HttpServletRequest;

public interface IMemberLoginService {

	public String ValidLoginCheck(String id, String pw, HttpServletRequest httpRequest); // MembersRepository.checkMember() 의 결과로써 숫자 값을 그대로 반환.
}

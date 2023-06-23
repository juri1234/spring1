package net.kdigital.spring1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //요청을 받을 것에는 꼭 추가할 것 
public class IndexController {
	
	// 유저가 /를 요청하면 index.html문서로 응답함 
	@GetMapping("/") // 처음엔 get요청으로 받을 것  localhost:8888/spring1/을 요청한건데 생략됨 
	public String index() {  
		System.out.println("요청을 받음");
		return "index";  // index.html => 이 파일이 없으면 클라이언트가 요청해도 오류가 남   
	}
}

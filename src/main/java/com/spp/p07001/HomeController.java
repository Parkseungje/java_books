package com.spp.p07001;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  // 이 어노테이션을 붙여주면 스프링 프레임워크가 이것이 컨트롤러인것을 인지하게된다.
public class HomeController {
	
	@RequestMapping("/") //사용자가 요청한 도메인 다음에 내용이 없으면 이 메소드와 매핑이 되는것이다. 예를들어 naver.com/
	public String home(Model model) {
		
		return "home"; // 위에서 도메인에 매핑이 되면 home메서드가 실행이되고 실행이 되고 views디렉터리에 있는 home.jsp로 응답을 해주라고 명시를 한것이다.
	}                  // 이때 home.jsp 이렇게 뒤에 jsp를 생략한것은 이미 servlet-context.xml에서 사용자가 반환을 해주는것은 viewresolver가 확장자 jsp를 붙여 찾도록 설계해놨기 때문이다. 
	
	@RequestMapping("/success")
	public String success(Model model) {
		
		return "success";
	}
	
	@RequestMapping("/fail")
	public String fail(Model model) {
		
		return "fail";
	}
	
}

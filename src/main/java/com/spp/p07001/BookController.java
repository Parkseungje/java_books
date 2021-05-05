package com.spp.p07001;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class BookController {
	
	@RequestMapping("/reg")
	public String registerBook(Model model){
		return "book/registerBook";
	}
	
	@RequestMapping("/regCon")
	public String registerConfirmBook(Model model){
		return null;
	}
}

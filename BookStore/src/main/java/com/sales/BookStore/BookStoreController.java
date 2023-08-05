package com.sales.BookStore;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookStoreController {
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "index";
	} 
	
}

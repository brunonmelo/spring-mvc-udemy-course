package spring.mvc.udemy.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@ComponentScan()
public class HomeController {
	
	@RequestMapping("/")
	public String index() {
		System.out.println("Iniciando o Home view");
		return "home";
	}

}

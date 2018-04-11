package spring.mvc.udemy.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	// need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// need a controller method to process the HTML form
	@RequestMapping("processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// controller version two of processForm
	@RequestMapping("processFormVersionTwo")
	public String shoutYourName(HttpServletRequest req, Model model) {
		// get name param from form
		String studentName = req.getParameter("studentName");

		// make name all uppercase
		studentName = studentName.toUpperCase().trim();
		
		// create msg
		String msg = "Yo! " + studentName;
		
		// adding msg to the model
		model.addAttribute("message", msg);
		
		return "helloworld";		
	}

}

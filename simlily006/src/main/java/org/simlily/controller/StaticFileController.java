package org.simlily.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StaticFileController {
	@RequestMapping("/test")
	public String test(Model model){
		return "help/help";
	}
}
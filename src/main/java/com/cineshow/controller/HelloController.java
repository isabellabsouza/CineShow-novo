package com.cineshow.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Controller
public class HelloController {	
	
	@GetMapping("/hello")
	public String hello() {
		return "CadastroFilme";
	}	
}

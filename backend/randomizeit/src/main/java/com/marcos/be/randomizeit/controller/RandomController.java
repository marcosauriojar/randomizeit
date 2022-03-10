package com.marcos.be.randomizeit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RandomController {

	@GetMapping(value="/")
	public String load(){
		return "Hola";
	}
}

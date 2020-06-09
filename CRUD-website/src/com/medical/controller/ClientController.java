package com.medical.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/client")
public class ClientController {
	
	@RequestMapping(value="/home", method= RequestMethod.GET)
	public String listClients(Model theModel) {
		return "home-page";
	}

}

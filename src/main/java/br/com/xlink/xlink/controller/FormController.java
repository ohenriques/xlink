package br.com.xlink.xlink.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.xlink.xlink.dto.RequestNewSocialMedia;
import br.com.xlink.xlink.repository.UserRepository;

@Controller
@RequestMapping("pedido")
public class FormController {
	
	@Autowired
	private UserRepository userRepository;

	@GetMapping("form")
	public String formInputSocialMidia(){
	return("user/form");	
	}
	
}

package ifrn.pi.ocorrencias.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PublicController {

	@RequestMapping("/")
	public String index() {
		return "home";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}
}

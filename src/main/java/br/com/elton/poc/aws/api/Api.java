package br.com.elton.poc.aws.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.elton.poc.aws.dto.Greeting;

@RestController
public class Api {

	@GetMapping
	public String init() {
		return "ok";
	}

	@GetMapping("/boostrap-app")
	public String boostrapInit() {
		return "App Funcionando!!!";
	}

	@GetMapping("/test")
	public Greeting test() {
		return new Greeting(32, "Elton P. Mesquita", "QI 08 Bloco E Apt 310");
	}

}

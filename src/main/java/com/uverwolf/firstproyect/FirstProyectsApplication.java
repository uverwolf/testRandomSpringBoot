package com.uverwolf.firstproyect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstProyectsApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(FirstProyectsApplication.class, args);
	}
	
	@RequestMapping("/")
	public String Hello() {
	return "Hola Cliente!!Como estas?";
}
	@RequestMapping("/Random")
	public String Mensaje() {
	return "Spring boot es genial!!";
}
}

package br.org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "Hello world!";
	}
	
	@GetMapping("/2")
	public String hello2() {
		return "Oláaaaaaaa família 41";
	}
	
	@GetMapping("/mentalidades")
	public String mentalidades() {
		return "\tMentalidades utilizadas para realizar a atividade: Persistência, Mentalidade de Crescimento e Orientação ao futuro";
	}
	
	@GetMapping("/objetivos")
	public String objetivos() {
		return "O objetivo de aprendizagem desta semana foi começar a usar o Spring e como o banco de dados funciona junto com o spring!";
	}
}

package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidades")
public class HabilidadesController {
	
	@GetMapping
	public String habilidades() {
		return "Habilidades:<br>"
				+ "Trabalho em equipe<br>"
				+ "Atenção aos detalhes<br>"
				+ "Proatividade<br>"
				+ "Comunicação<br><br>"
				+ "Mentalidades:<br>"
				+ "Orientação ao futuro<br>"
				+ "Responsabilidade pessoal<br>"
				+ "Mentalidade de crescimento<br>"
				+ "Persistência<br><br>";
	}

}

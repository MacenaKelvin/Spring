package br.org.generation.habilidadesemanal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidadesemanal")
public class HabilidadeSemanal {
	
	@GetMapping
	public String hello() {
		return "Proatividade, comunicação e orientação ao futuro";

}
}
package br.org.generationhabilidade.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/habilidade")
public class HabilidadeController {
	
@GetMapping
public String habilidade() {
	return "Persistencia, orientação ao futuro e Atenção aos detalhes";
}
	
}

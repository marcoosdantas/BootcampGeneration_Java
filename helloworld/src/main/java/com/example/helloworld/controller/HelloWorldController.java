package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello-world")
public class HelloWorldController {

    @GetMapping
    public String helloWorld(){
        return "Hello World!";
    }
    @GetMapping("/bsm")
    public String bsm(){
        return """
                Persistência
                Mentalidade de Crescimento
                Orientação ao Futuro
                Responsabilidade Pessoal
                Trabalho em Equipe
                Comunicação
                Orientação aos Detalhes
                Proatividade""";
    }
    @GetMapping("/aprendizagem")
    public String aprendizagem(){
        return """
               Aprofundar meus conhecimentos em MySQL
               Compreender as anotações do Spring Boot
               Estudar mais sobre MVC""";
    }
}

package com.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/bsm")
    public String hello_2() {
        return "<ul>" +
                "<li>Mentalidades" +
                "<ul><li>Orientação ao Futuro</li>" +
                "<li>Responsabilidade Pessoal</li>" +
                "<li>Mentalidade de Crescimento</li>" +
                "<li>Persistência</li>" +
                "</ul></li>" +
                "<li>Habilidades" +
                "<ul><li>Trabalho em Equipe</li>" +
                "<li>Atenção aos Detalhes</li>" +
                "<li>Proatividade</li>" +
                "<li>Comunicação</li></ul></li></ul>";
    }

    @GetMapping("/Objetivos")
    public String hello_3() {
        return "<ul>" +
                "<li>Objetivos para esta semana:" +
                "<ul><li>Reescrever os codigos das aulas anteriores em Spring</li>" +
                "<li>Estudar SQL criando banco de dados para projeto de editor de ficha de personagem do RPG D&D</li>" +
                "<li>Revisar Java</li>" +
                "</ul>" +
                "</li>" +
                "</ul>";
    }

}

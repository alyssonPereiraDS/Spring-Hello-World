package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class controller {
    @GetMapping
    public String helloWorld() {
        return "Hello World";
    }
    @GetMapping("/lista-bsms")
    public String mostraLista(){
        return "<ul>Lista BSMs Generation<li>Orientação ao Futuro</li><li>Responsabilidade Pessoal</li><li>Mentalidade de Crescimento</li><li>Persistência</li></ul>";
    }
    @GetMapping("/objetivo")
    public String mostraObjetivo(){
        return "<h1>Meu objetivo de melhoria semanal</h1> <h2>pretendo melhorar em gestão do tempo</h2>";
    }
}

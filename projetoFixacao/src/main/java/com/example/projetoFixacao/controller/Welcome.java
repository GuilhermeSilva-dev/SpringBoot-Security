package com.example.projetoFixacao.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @RequestMapping("/")
    public String mensagem() {
        return "Bem-vindo";
    }
}

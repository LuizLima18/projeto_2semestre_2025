package com.programacao.web.fatec.api_fatec.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @GetMapping("/teste1")
    public String testeCliente(){
        return "TesteCliente";
    }

    @GetMapping("/teste2/{nome}")
    public String testeCliente2(@PathVariable String nome){
        return nome;
    }
}

package com.OdinCompany.fatecOps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping("/")
    public String status() {
        return """
               Sistema de Gestão de Laboratórios
               Versão: 0.1.0
               Sistema em desenvolvimento.
               """;
    }
}
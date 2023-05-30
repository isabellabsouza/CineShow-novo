package com.cineshow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cineshow.model.Filme;
import com.cineshow.service.FilmeService;


@Controller

public class PesquisaFilmeController {
    
    @Autowired
    private FilmeService filmeService;

    @GetMapping("/pesquisaFilme")
    public String pesquisaFilme(Model model) {

        
        List<Filme> filmes = filmeService.findAll();
        model.addAttribute("filmes", filmes);
        return "PesquisaFilme";
    }
    
}

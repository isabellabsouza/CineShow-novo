package com.cineshow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cineshow.dto.FilmeDTO;
import com.cineshow.model.Filme;
import com.cineshow.service.FilmeService;

import jakarta.validation.Valid;

@Controller
public class CadastroFilmeController {
    /*
    @Autowired
    private FilmeRepository filmeRepository;*/

    @Autowired
    private FilmeService filmeService;
    
    @GetMapping("/cadastroFilme")
    public String cadastroFilme(FilmeDTO filmeDTO) {
        return "CadastroFilme";
    }

    @PostMapping("/cadastroFilme")
    public String novo(@Valid FilmeDTO filmeDTO, BindingResult result) {

        /*
        if(result.hasErrors()) {
            return "aluno/formulario";
        }*/
        
        Filme filme = filmeDTO.toFilme();
        filmeService.save(filme);

        return "redirect:/pesquisaFilme";
    }
}

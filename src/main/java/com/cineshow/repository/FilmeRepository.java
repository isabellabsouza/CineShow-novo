package com.cineshow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cineshow.model.Filme;


public interface FilmeRepository extends JpaRepository<Filme, Long>{
    
}

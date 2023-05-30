package com.cineshow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cineshow.model.Filme;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Long>{
    
}

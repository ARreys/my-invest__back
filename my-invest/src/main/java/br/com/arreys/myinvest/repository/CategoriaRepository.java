package br.com.arreys.myinvest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.arreys.myinvest.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
    
}

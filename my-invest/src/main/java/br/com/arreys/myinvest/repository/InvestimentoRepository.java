package br.com.arreys.myinvest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.arreys.myinvest.domain.Investimento;

public interface InvestimentoRepository extends JpaRepository<Investimento, Long> {

}

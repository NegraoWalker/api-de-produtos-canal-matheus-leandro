package com.walker.api_de_produtos_canal_matheus_leandro.repository;

import com.walker.api_de_produtos_canal_matheus_leandro.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {


}

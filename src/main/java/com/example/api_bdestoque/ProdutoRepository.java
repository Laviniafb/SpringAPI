package com.example.api_bdestoque;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {

    static ProdutoRepository ok(String produtoInseridoComSucesso) {
        return null;
    }

}

package com.customer.api.customer.repository;

import com.customer.api.customer.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    /*List<Produto> getByMarca(Produto produto);*/
}

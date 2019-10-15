package com.customer.api.customer.service;


import com.customer.api.customer.entity.Produto;
import com.customer.api.customer.repository.ProdutoRepository;
import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLMutation;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Service
@GraphQLApi
@PersistenceContext
public class ProdutoService {

    private EntityManager entityManager;

    private final ProdutoRepository repository;
    private final GQLService service;

    public ProdutoService(ProdutoRepository repository, GQLService service) {
        this.repository = repository;
        this.service = service;
    }

    /*
    * Metodo do servico que vai listar os produtos entityManager.createQuery("from Genre").getResultList()
    * */
    @GraphQLQuery(name = "listaProdutos")
    public List<Produto> getProdutos(){
        return repository.findAll();
    }

    /*
    * Listar por marca
    * */
    @GraphQLQuery(name = "listaMarcaProdutos")
    public List<Produto> getMarcaProduto(@GraphQLArgument(name = "marca")Produto produto){
        return entityManager.createQuery("from Produto where marca = '"+ produto.getsMarca() +"'").getResultList();
    }

    /*
    * Pesquisa o produto pelo Id
    * */
    @GraphQLQuery(name = "idProduto")
    public Optional<Produto> getProdutoById(@GraphQLArgument(name = "id")Long id){
        return repository.findById(id);
    }

    /*
    * Salva o Produto cadastrado
    * */
    @GraphQLMutation(name = "salvarProduto")
    public Produto saveProduto(@GraphQLArgument(name = "produto")Produto produto){
        return repository.save(produto);
    }

    /*
     * Update do Produto cadastrado
     * */
    @GraphQLMutation(name = "updateProduto")
    public Produto updateProduto(@GraphQLArgument(name = "update")Produto produto){
        if (produto.getId() != null){
            return saveProduto(produto);
        }
        return repository.getOne(produto.getId());
    }

    /*
    * Deleta o produto pelo Id
    * */
    @GraphQLMutation(name = "deleteProduto")
    public void deleteProduto(@GraphQLArgument(name = "id")Long id){
        repository.deleteById(id);
    }

    /*@GraphQLQuery(name = "isCool")
    public boolean isCool(@GraphQLContext Produto produto) {
        return !produto.getsDescricao().equals("Chave de Fenda 3/4") &&
                !produto.getsDescricao().equals("Alicate de Bico") &&
                !produto.getsDescricao().equals("Parafuso 1/2 Polegada") &&
                !produto.getsDescricao().equals("Martelo para Madeira");
    }

    @GraphQLQuery(name = "giphyUrl")
    public String getGiphyUrl(@GraphQLContext Produto produto) {
        return service.getGiphyUrl(produto.getsDescricao());
    }*/
}

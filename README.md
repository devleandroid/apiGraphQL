# apiGraphQL Spring Boot With Java
Aplicação criada para estudos sobre GraphQL

Nela contem os metodos de: 
- listaProdutos (Pesquisa todos os produtos)
- listaMarcaProdutos (Pesquisa os produtos por marca)
- idProduto (Lista o produto por id)
- salvarProduto (Salva um produto/inclui)
- updateProduto (Autualiza o produto)
- deleteProduto (Deleta um produto)

Para acessar o Playgound basta executar o projeto e acessar ele pela url http://localhost:8080/gui


Para testar o metodo de listaProdutos:
{
  listaProdutos{
    id
    getsDescricao
    getsMarca
    getsTipo
    getsQntd
  }
}

Para testar o metodo idProduto:
{
  idProduto(id:3){
    getsDescricao
    getsMarca
    getsTipo
  }
}

Para testar o metodo salvarProduto:
mutation{
  salvarProduto(produto:{
    id:"3"
    Descricao:"Parafuso", 
    Marca:"Qualquer",
    Tipo:"Ferramenta",
    Quantidade:"3"
  } ){
    id
    getsDescricao
    getsMarca
    getsTipo
    getsQntd
  }
}

Para testar o metodo updateProduto:
mutation{
  updateProduto(update:{
    id:"3"
    Descricao:"Parafuso de Rosca", 
    Marca:"Qualmor",
    Tipo:"Ferragem",
    Quantidade:"13"
  } ){
    id
    getsDescricao
    getsMarca
    getsTipo
    getsQntd
  }
}

Para testar o metodo deleteProduto:
mutation{
  deleteProduto(id:3)
}

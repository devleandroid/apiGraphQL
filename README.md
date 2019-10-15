# apiGraphQL Spring Boot With Java
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
</head>
<body>
  

Nela contem os metodos de: 
- listaProdutos (Pesquisa todos os produtos)
- listaMarcaProdutos (Pesquisa os produtos por marca)
- idProduto (Lista o produto por id)
- salvarProduto (Salva um produto/inclui)
- updateProduto (Autualiza o produto)
- deleteProduto (Deleta um produto)

Para acessar o Playgound basta executar o projeto e acessar ele pela url http://localhost:8080/gui

Para testar o metodo de listaProdutos:
<pre>
  <code>
      {
        listaProdutos{
          id
          getsDescricao
          getsMarca
          getsTipo
          getsQntd
        }
      }
  </code>
</pre>
Para testar o metodo idProduto:
<pre>
   <code>
      {
        idProduto(id:3){
          getsDescricao
          getsMarca
          getsTipo
        }
      }
    </code>
  </pre>

Para testar o metodo salvarProduto:
<pre>
   <code>
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
   </code>
 </pre>

Para testar o metodo updateProduto:
<pre>
   <code>
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
  </code>
</pre>

Para testar o metodo deleteProduto:
<pre>
  </code>
mutation{
deleteProduto(id:3)
}
  </code>
</pre>
    
</body>
</html>

package com.customer.api.customer.entity;

import io.leangen.graphql.annotations.GraphQLQuery;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Produto {

    @Id
    @GeneratedValue
    @GraphQLQuery(name = "id", description = "É o Id do produto")
    private Long id;

    @GraphQLQuery(name = "Descricao")
    private String sDescricao;

    @GraphQLQuery(name = "Marca")
    private String sMarca;

    @GraphQLQuery(name = "Tipo")
    private String sTipo;

    @GraphQLQuery(name = "Quantidade")
    private String sQntd;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getsDescricao() {
        return sDescricao;
    }

    public void setsDescricao(String sDescricao) {
        this.sDescricao = sDescricao;
    }

    public String getsMarca() {
        return sMarca;
    }

    public void setsMarca(String sMarca) {
        this.sMarca = sMarca;
    }

    public String getsTipo() {
        return sTipo;
    }

    public void setsTipo(String sTipo) {
        this.sTipo = sTipo;
    }

    public String getsQntd() {
        return sQntd;
    }

    public void setsQntd(String sQntd) {
        this.sQntd = sQntd;
    }
}

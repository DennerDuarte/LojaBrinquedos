package br.com.fiap.lojaBrinquedos.DTO;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;

import br.com.fiap.lojaBrinquedos.Controller.BrinquedoController;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class BrinquedoDTO {
    public Long id;
    public String nome;
    public String tipo;
    public Integer classificacao;
    public String tamanho;
    public Double preco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Integer classificacao) {
        this.classificacao = classificacao;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public static EntityModel<BrinquedoDTO> toModel(BrinquedoDTO brinquedo) {
        Link selfLink = WebMvcLinkBuilder.linkTo(BrinquedoController.class)
                .slash(brinquedo.getId())
                .withSelfRel();

        Link getAllLink = WebMvcLinkBuilder.linkTo(BrinquedoController.class)
                .withRel("getAll");

        Link getByIdLink = WebMvcLinkBuilder.linkTo(BrinquedoController.class)
                .slash(brinquedo.getId())
                .withRel("getById");

        Link createLink = WebMvcLinkBuilder.linkTo(BrinquedoController.class)
                .withRel("create");

        Link updateLink = WebMvcLinkBuilder.linkTo(BrinquedoController.class)
                .slash(brinquedo.getId())
                .withRel("update");

        Link deleteLink = WebMvcLinkBuilder.linkTo(BrinquedoController.class)
                .slash(brinquedo.getId())
                .withRel("delete");

        return EntityModel.of(brinquedo, selfLink, getAllLink, getByIdLink, createLink, updateLink, deleteLink);
    }
}


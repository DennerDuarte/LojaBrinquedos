package br.com.fiap.lojaBrinquedos.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
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
@Entity
@Table(name="TDS_TB_Brinquedos")
public class Brinquedo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public Long id;

    @Column(name="nome")
    @Size(min = 10, max = 200, message = "O nome precisa ter entre 10 e 200 caracteres")
    public String nome;

    @Column(name="tipo")
    @Size(min = 10, max = 50, message = "O tipo precisa ter entre 10 e 50 caracteres")
    public String tipo;

    @Column(name="classificacao")
    public Integer classificacao;

    @Column(name="tamanho")
    @Size(min = 1, max = 20, message = "O tamanho precisa ter entre 1 e 20 caracteres")
    public String tamanho;

    @Column(name="preco")
    public Double preco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @Size(min = 10, max = 200, message = "O nome precisa ter entre 10 e 200 caracteres") String getNome() {
        return nome;
    }

    public void setNome(@Size(min = 10, max = 200, message = "O nome precisa ter entre 10 e 200 caracteres") String nome) {
        this.nome = nome;
    }

    public @Size(min = 10, max = 50, message = "O tipo precisa ter entre 10 e 50 caracteres") String getTipo() {
        return tipo;
    }

    public void setTipo(@Size(min = 10, max = 50, message = "O tipo precisa ter entre 10 e 50 caracteres") String tipo) {
        this.tipo = tipo;
    }

    public Integer getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Integer classificacao) {
        this.classificacao = classificacao;
    }

    public @Size(min = 1, max = 20, message = "O tamanho precisa ter entre 1 e 20 caracteres") String getTamanho() {
        return tamanho;
    }

    public void setTamanho(@Size(min = 1, max = 20, message = "O tamanho precisa ter entre 1 e 20 caracteres") String tamanho) {
        this.tamanho = tamanho;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}

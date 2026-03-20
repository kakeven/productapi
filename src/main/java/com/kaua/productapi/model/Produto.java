package com.kaua.productapi.model;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "produtos")

public class Produto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    private BigDecimal preco;
    
    @NotBlank(message = "Nome não pode ser vazio")
    private String nome;
    
    @NotBlank(message = "Descricao nao pode ser vazia")
    private String descricao;
    
    
    @NotBlank(message = "Codigo nao deve ser vazio")
    @Column(unique = true)
    private String codigo;
    
    @NotNull
    private Integer quantidade;
    
    @CreationTimestamp
    private LocalDateTime dataCriacao;
    
   

    public BigDecimal getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
    this.id = id;
}

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    

}

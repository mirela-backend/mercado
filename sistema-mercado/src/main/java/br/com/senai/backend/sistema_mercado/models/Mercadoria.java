package br.com.senai.backend.sistema_mercado.models;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mercadoria")
public class Mercadoria {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_mercadoria")
    private Integer id;

    @Column(name = "preco")
    private String preco;

    @Column(name = "quantidade")
    private String quantidade;

    @Column(name = "categoria")
    private String categoria;

    @Column(name = "data_validade")
    private LocalDate dataValidade;

    public Mercadoria() {
    }

    public Mercadoria(Integer id, String preco, String quantidade, String categoria, LocalDate dataValidade) {
        this.id = id;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
        this.dataValidade = dataValidade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    

}

package me.dio.desafio_api_rest.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tabela_cartao")
public class Cartao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String numero;
    @Column(precision = 13, scale = 2)
    private BigDecimal limiteCartao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public BigDecimal getLimiteCartao() {
        return limiteCartao;
    }

    public void setLimiteCartao(BigDecimal limiteCartao) {
        this.limiteCartao = limiteCartao;
    }
}

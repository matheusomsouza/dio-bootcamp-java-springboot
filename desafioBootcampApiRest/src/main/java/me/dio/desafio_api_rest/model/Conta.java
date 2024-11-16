package me.dio.desafio_api_rest.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tabela_conta")
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String numeroConta;
    private String numeroAgencia;
    @Column(precision = 13, scale = 2)
    private BigDecimal saldo;
    @Column(precision = 13, scale = 2)
    private BigDecimal limiteConta;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getLimiteConta() {
        return limiteConta;
    }

    public void setLimiteConta(BigDecimal limiteConta) {
        this.limiteConta = limiteConta;
    }
}

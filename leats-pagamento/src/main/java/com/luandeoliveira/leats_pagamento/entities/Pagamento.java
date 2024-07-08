package com.luandeoliveira.leats_pagamento.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.util.Objects;


@Entity
class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "pedido_id")
    private Long pedidoId;

    @Column(name = "forma_de_pagamento_id")
    private Long formaDePagamentoId;

    @NotNull
    @Positive
    private BigDecimal valor;

    @NotBlank
    @Size(max = 100)
    private String nome;

    @NotBlank
    private String numero;

    @NotBlank
    private String expiracao;

    @NotBlank
    @Size(min = 3, max = 3)
    private String codigo;

    public Long getId() {
        return id;
    }

    public Long getPedidoId() {
        return pedidoId;
    }

    public Long getFormaDePagamentoId() {
        return formaDePagamentoId;
    }

    public @NotNull @Positive BigDecimal getValor() {
        return valor;
    }

    public void setValor(@NotNull @Positive BigDecimal valor) {
        this.valor = valor;
    }

    public @NotBlank @Size(max = 100) String getNome() {
        return nome;
    }

    public void setNome(@NotBlank @Size(max = 100) String nome) {
        this.nome = nome;
    }

    public @NotBlank String getNumero() {
        return numero;
    }

    public void setNumero(@NotBlank String numero) {
        this.numero = numero;
    }

    public @NotBlank String getExpiracao() {
        return expiracao;
    }

    public void setExpiracao(@NotBlank String expiracao) {
        this.expiracao = expiracao;
    }

    public @NotBlank @Size(min = 3, max = 3) String getCodigo() {
        return codigo;
    }

    public void setCodigo(@NotBlank @Size(min = 3, max = 3) String codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pagamento pagamento = (Pagamento) o;
        return Objects.equals(id, pagamento.id) && Objects.equals(pedidoId, pagamento.pedidoId) && Objects.equals(formaDePagamentoId, pagamento.formaDePagamentoId) && Objects.equals(valor, pagamento.valor) && Objects.equals(nome, pagamento.nome) && Objects.equals(numero, pagamento.numero) && Objects.equals(expiracao, pagamento.expiracao) && Objects.equals(codigo, pagamento.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pedidoId, formaDePagamentoId, valor, nome, numero, expiracao, codigo);
    }
}

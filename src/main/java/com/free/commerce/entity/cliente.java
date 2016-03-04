package com.free.commerce.entity;

import org.springframework.context.annotation.Primary;

import javax.persistence.*;

/**
 * Created by eduardosanson on 03/03/16.
 */
@Entity
@Table(name = "CLIENTE")
public class cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOME", nullable = false)
    private String nome;

    @Column(name = "SOBRENOME")
    private String sobrenome;

    @Column(name = "CPF",nullable = false)
    private String cpf;

    @Column(name = "TELEFONE")
    private String telefone;

    @
    private Endereco endereco;
    private Endereco enderecoEntrega;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

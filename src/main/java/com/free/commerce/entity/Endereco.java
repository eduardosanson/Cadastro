package com.free.commerce.entity;

import javax.persistence.*;

/**
 * Created by eduardosanson on 03/03/16.
 */
@Entity
@Table(name = "ENDERECO")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cep;
    private String nome;
    private String bairro;
    private String cidade;
    private String pais;
    private String numero;
    private String complemento;
}

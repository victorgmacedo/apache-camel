package br.com.camel.model;

import lombok.Data;

@Data
public class Livro {
    private String codigo;
    private String titulo;
    private String tituloCurto;
    private String nomeAutor;
    private String valorEbook;
    private String valorImpresso;
}

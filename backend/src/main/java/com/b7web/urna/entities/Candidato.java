package com.b7web.urna.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Candidato {

    private Long id;
    private String numero;
    private String nome;
    private String partido;
    private List<Fotos> fotos = new ArrayList<>();

    public Candidato(){
    }

    public Candidato(Long id,String numero, String nome, String partido) {
        this.id = id;
        this.numero = numero;
        this.nome = nome;
        this.partido = partido;
    }

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public List<Fotos> getFotos() {
        return fotos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidato candidato = (Candidato) o;
        return Objects.equals(id, candidato.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

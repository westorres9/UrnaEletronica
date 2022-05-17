package com.b7web.urna.entities;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Etapa {

    private Long id;
    private String titulo;
    private Integer numeros;
    private Set<Candidato> candidatos = new HashSet<>();

    public Etapa() {
    }

    public Etapa(Long id, String titulo, Integer numeros, Set<Candidato> candidatos) {
        this.id = id;
        this.titulo = titulo;
        this.numeros = numeros;
        this.candidatos = candidatos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getNumeros() {
        return numeros;
    }

    public void setNumeros(Integer numeros) {
        this.numeros = numeros;
    }

    public Set<Candidato> getCandidatos() {
        return candidatos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Etapa etapa = (Etapa) o;
        return Objects.equals(id, etapa.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

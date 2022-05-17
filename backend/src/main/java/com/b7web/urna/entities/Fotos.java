package com.b7web.urna.entities;

public class Fotos {

    private String url;
    private String legenda;

    public Fotos(){
    }

    public Fotos(String url, String legenda) {
        this.url = url;
        this.legenda = legenda;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLegenda() {
        return legenda;
    }

    public void setLegenda(String legenda) {
        this.legenda = legenda;
    }


}

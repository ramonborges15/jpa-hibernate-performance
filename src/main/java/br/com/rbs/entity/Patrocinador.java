package br.com.rbs.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patrocinador implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomePatrocinador;
    private Float valorPatrocinio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomePatrocinador() {
        return nomePatrocinador;
    }

    public void setNomePatrocinador(String nomePatrocinador) {
        this.nomePatrocinador = nomePatrocinador;
    }

    public Float getValorPatrocinio() {
        return valorPatrocinio;
    }

    public void setValorPatrocinio(Float valorPatrocinio) {
        this.valorPatrocinio = valorPatrocinio;
    }
}

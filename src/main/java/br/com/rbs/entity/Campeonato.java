package br.com.rbs.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Campeonato implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeCampeonato;
    private String tipo;
    
    @ManyToMany(mappedBy = "listaCampeonatos")
    private List<Clube> listaClubes; //bidirecional

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCampeonato() {
        return nomeCampeonato;
    }

    public void setNomeCampeonato(String nomeCampeonato) {
        this.nomeCampeonato = nomeCampeonato;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Clube> getListaClubes() {
        return listaClubes;
    }

    public void setListaClubes(List<Clube> listaClubes) {
        this.listaClubes = listaClubes;
    }
    
    
}

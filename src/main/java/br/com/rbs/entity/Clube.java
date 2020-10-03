package br.com.rbs.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


@Entity
public class Clube implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeClube;

    @OneToMany(mappedBy = "meuClube")
    private List<Jogador> listaJogadores; // bidirecional
    @ManyToMany
    private List<Campeonato> listaCampeonatos; //bidirecional

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeClube() {
        return nomeClube;
    }

    public void setNomeClube(String nomeClube) {
        this.nomeClube = nomeClube;
    }

    public List<Jogador> getListaJogadores() {
        return listaJogadores;
    }

    public void setListaJogadores(List<Jogador> listaJogadores) {
        this.listaJogadores = listaJogadores;
    }

    public List<Campeonato> getListaCampeonatos() {
        return listaCampeonatos;
    }

    public void setListaCampeonatos(List<Campeonato> listaCampeonatos) {
        this.listaCampeonatos = listaCampeonatos;
    }
}

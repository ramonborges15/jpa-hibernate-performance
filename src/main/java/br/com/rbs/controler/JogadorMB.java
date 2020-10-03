package br.com.rbs.controler;

import br.com.rbs.dao.JogadorDAO;
import br.com.rbs.entity.Jogador;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

@ViewScoped
@Named(value = "jogadorMB")
public class JogadorMB implements Serializable{

    @Inject
    private JogadorDAO jogadorDao;
    private List<Jogador> jogadores;

    @PostConstruct
    public void init() {
        System.out.println("Iniciado");
        this.jogadores = this.jogadorDao.carregarJogadoresConsultaPerformatica();
        System.out.println("Finalizado");
    }

    public void carregarJogadoresConsultaPerformatica() {
        this.jogadores = this.jogadorDao.carregarJogadoresConsultaPerformatica();
    }

    public void carregarJogadoresConsultaLenta() {
        this.jogadores = this.jogadorDao.carregarJogadoresConsultaLenta();
    }
    
    public List<Jogador> getJogadores() {
        return this.jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }
}

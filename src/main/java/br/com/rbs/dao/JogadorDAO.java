package br.com.rbs.dao;

import br.com.rbs.entity.Jogador;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class JogadorDAO{
    
    @PersistenceContext(unitName = "rbsPU")
    private EntityManager em;
    
    public List<Jogador> carregarJogadoresConsultaPerformatica() {
        String jpql = "SELECT j FROM Jogador j "
                + "LEFT JOIN FETCH j.meuClube m "
                + "LEFT JOIN FETCH j.patrocinador p";
        
        return this.em.createQuery(jpql).getResultList();
    }
    
    public List<Jogador> carregarJogadoresConsultaLenta() {
        String jpql = "SELECT j FROM Jogador j";
        
        return this.em.createQuery(jpql).getResultList();
    }
}
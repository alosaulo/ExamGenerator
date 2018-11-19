/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Collection;
import javax.persistence.*;

/**
 *
 * @author CTC
 */
@Entity
@Table(name="tags")
public class Tags {

    @Id
    private Long ID;
    private String nome;
    private String descricao;
    
    @ManyToOne
    @JoinColumn(name="questao_id")
    private Collection<Questao> questoes;
    
    @ManyToOne
    @JoinColumn(name="prova_id")
    private Collection<Prova> provas;
    
    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author CTC
 */
@Entity
public class Prova {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataCriacao;
    
    private String nome;
    
    private String disciplina;
    
    @ManyToOne
    @JoinColumn(name="acervo_id")
    private Acervo acervo;
    
    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Acervo getAcervo() {
        return acervo;
    }

    public void setAcervo(Acervo acervo) {
        this.acervo = acervo;
    }
}

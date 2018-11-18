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
@Table(name="prova")
public class Prova {

    /**
     * @param dataCriacao the dataCriacao to set
     */
    public void setDataCriacao(java.sql.Timestamp dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
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

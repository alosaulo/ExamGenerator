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
@Table(name="questao")
public class Questao {

    @Id
    private Long ID;
    private String pergunta;
    private String disciplina;    
    
    @OneToOne(mappedBy = "ID")
    private Collection<Questao> dependentes;
    
    @OneToOne()
    private Collection<Tags> tags;
    
    @ManyToMany
    private Collection<Resposta> respostas;
    
    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}

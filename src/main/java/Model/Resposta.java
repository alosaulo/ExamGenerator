/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.*;

/**
 *
 * @author CTC
 */
@Entity
@Table(name="resposta")
public class Resposta {

    @Id
    private Long ID;

    private String valor;
    private boolean Correta;
    
    @OneToMany(mappedBy = "respostas")
    @JoinColumn(name="questao_id")
    private Questao questao;
    
    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public boolean isCorreta() {
        return Correta;
    }

    public void setCorreta(boolean Correta) {
        this.Correta = Correta;
    }

    public Questao getQuestao() {
        return questao;
    }

    public void setQuestao(Questao questao) {
        this.questao = questao;
    }
    
}

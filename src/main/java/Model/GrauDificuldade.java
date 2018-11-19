/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author CTC
 */
public enum GrauDificuldade {
    FACIL("fácil"),
    MEDIO("médio"),
    DIFICIL("difícil");
    
    private String dificuldade;
    
    GrauDificuldade(String dificuldade){
        this.dificuldade = dificuldade;
    }
    
    public String GetDificuldade(){
        return dificuldade;
    }
    
}

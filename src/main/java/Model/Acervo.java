package Model;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CTC
 */
@Entity
@Table(name="acervo")
public class Acervo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    
    private String nome;
    
    @OneToMany(mappedBy = "acervo")
    @Column(nullable=true)
    private Collection<Prova> provasGeradas = new ArrayList<>();
    
    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Collection<Prova> getProvasGeradas() {
        return provasGeradas;
    }

    public void setProvasGeradas(Collection<Prova> provasGeradas) {
        this.provasGeradas = provasGeradas;
    }
    
    public void addProva(Prova prova){
        this.provasGeradas.add(prova);
    }
    
}

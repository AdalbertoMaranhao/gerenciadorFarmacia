/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia.modelo;

import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;

/**
 *
 * @author Adalberto
 */
@Entity
public class Medicamentos {
    
    @Id
    private String cod;
    
    @Column(nullable = true)
    private String nome;
    
    @Column(nullable = true)
    private String tipo;
    
    @Column(nullable = true)
    private boolean receita;
    
    @Column(nullable = true)
    private String qtde;
    
    @PrePersist
    public void gerarID() {
        this.cod = UUID.randomUUID().toString();
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isReceita() {
        return receita;
    }

    public void setReceita(boolean receita) {
        this.receita = receita;
    }

    public String getQtde() {
        return qtde;
    }

    public void setQtde(String qtde) {
        this.qtde = qtde;
    }
    
    
    
}

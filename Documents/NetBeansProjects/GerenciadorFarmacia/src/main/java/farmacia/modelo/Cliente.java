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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;

/**
 *
 * @author Adalberto
 */
@Entity
public class Cliente {
  
    @Id
    private String cod;
    
    @Column(nullable = true)
    private String nome;
    
    @Column(unique = true)
    private String cpf;
    
     @JoinColumn
    @ManyToOne
    private Telefone telefone;
        
    @JoinColumn
    @OneToOne
    private Endereco endereco;
            
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
}

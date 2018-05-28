/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia.modelo;

import java.util.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;

/**
 *
 * @author Adalberto
 */
@Entity
public class ListaCompraEstoque {
    
    @Id
    private String cod;
    
    @Column(nullable = true)
    private String qtde;
    
    @Column(nullable = true)
    private Double valor;
    
    @Column(nullable = true)
    private Date validade;
    
    @JoinColumn
    @ManyToMany
    private Medicamentos medicamento;
    
    @JoinColumn
    @ManyToMany
    private Laboratorio laboratorio;
            
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

    public String getQtde() {
        return qtde;
    }

    public void setQtde(String qtde) {
        this.qtde = qtde;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public Medicamentos getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamentos medicamento) {
        this.medicamento = medicamento;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }
    
    
}

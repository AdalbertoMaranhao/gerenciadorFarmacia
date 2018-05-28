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
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;

/**
 *
 * @author Adalberto
 */
@Entity
public class CompraEstoque {
    
    @Id
    private String cod;
    
    @Column(nullable = true)
    private Double valor_total;
    
    @JoinColumn
    @OneToOne
    private ListaCompraEstoque lista_compra;
                 
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

    public Double getValor_total() {
        return valor_total;
    }

    public void setValor_total(Double valor_total) {
        this.valor_total = valor_total;
    }

    public ListaCompraEstoque getLista_compra() {
        return lista_compra;
    }

    public void setLista_compra(ListaCompraEstoque lista_compra) {
        this.lista_compra = lista_compra;
    }
    
    
}

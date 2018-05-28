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
public class VendaMedicamentos {
    
    @Id
    private String cod;
    
    @JoinColumn
    @OneToOne
    private ListaMedicamentos lista_med;
    
    @JoinColumn
    @ManyToOne
    private Cliente cliente;
    
    @Column
    private Double total_compra;
             
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

    public ListaMedicamentos getLista_med() {
        return lista_med;
    }

    public void setLista_med(ListaMedicamentos lista_med) {
        this.lista_med = lista_med;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double getTotal_compra() {
        return total_compra;
    }

    public void setTotal_compra(Double total_compra) {
        this.total_compra = total_compra;
    }
    
    
}

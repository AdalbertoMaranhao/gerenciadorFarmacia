/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia.modelo;

import java.util.UUID;
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
public class Pagamento {
      
    @Id
    private String cod;
    
    @JoinColumn
    @OneToOne
    private FormaDePagamento forma_pag;
    
    @JoinColumn
    @OneToOne
    private VendaMedicamentos venda_med;
             
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

    public FormaDePagamento getForma_pag() {
        return forma_pag;
    }

    public void setForma_pag(FormaDePagamento forma_pag) {
        this.forma_pag = forma_pag;
    }

    public VendaMedicamentos getVenda_med() {
        return venda_med;
    }

    public void setVenda_med(VendaMedicamentos venda_med) {
        this.venda_med = venda_med;
    }
    
    
}

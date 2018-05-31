/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia.repositorio;

import farmacia.modelo.Cidade;
import farmacia.repositorio.util.FabricaConexao;
import javax.persistence.EntityManager;

/**
 *
 * @author Adalberto
 */
public class CidadeRepositorio {
    public void salvar(Cidade cidade) {
        EntityManager em = FabricaConexao.getEntityManagerMysql();
        //iniciando uma transação
        em.getTransaction().begin();

        em.persist(cidade);

        em.getTransaction().commit();

        em.close();

}
}

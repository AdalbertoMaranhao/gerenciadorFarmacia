/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia.repositorio.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Adalberto
 */
public class FabricaConexao {
   static private EntityManagerFactory factoryMysql 
           = Persistence.createEntityManagerFactory("FarmaciaMysqlPU");
   
   static private EntityManagerFactory factoryPg 
           = Persistence.createEntityManagerFactory("FarmaciaPGSqlPU");

    public FabricaConexao() {
    }
   
   public static EntityManager getEntityManagerMysql() {
        return factoryMysql.createEntityManager();
    }
   
   public static EntityManager getEntityManagerPg() {
        return factoryPg.createEntityManager();
    }
   
   public static void closeMysql() {
        factoryMysql.close();
    }
   
   public static void closePg() {
        factoryPg.close();
    }
}

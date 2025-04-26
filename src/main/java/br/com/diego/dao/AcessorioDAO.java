/**
 * 
 */
package br.com.diego.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.diego.domain.Acessorio;

/**
 * 
 */
public class AcessorioDAO implements IAcessorioDAO {

    @Override
    public void cadastrar(Acessorio acessorio) {
        
        EntityManagerFactory entityManagerFactory = 
                Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager(); 
        entityManager.getTransaction().begin();
        entityManager.persist(acessorio);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}

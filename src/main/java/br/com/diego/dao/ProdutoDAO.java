/**
 * 
 */
package br.com.diego.dao;

import br.com.diego.domain.Produto;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProdutoDAO implements IProdutoDAO {

    @Override
    public void cadastrar(Produto produto) {
        
        EntityManagerFactory entityManagerFactory = 
                Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager(); 
        entityManager.getTransaction().begin();
        entityManager.persist(produto);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
/**
 * 
 */
package br.com.diego;

import org.junit.Test;

import br.com.diego.dao.IProdutoDAO;
import br.com.diego.dao.ProdutoDAO;
import br.com.diego.domain.Produto;

/**
 * 
 */
public class ProdutoTest {
	
	private IProdutoDAO produtoDAO;
	
	public ProdutoTest() {
		produtoDAO = new ProdutoDAO();
	}
	
	@Test
	public void cadastrar() {
		Produto produto = new Produto();
        produto.setNome("CANETA");
        produto.setPreco(2.0);
        produtoDAO.cadastrar(produto);
	}

}

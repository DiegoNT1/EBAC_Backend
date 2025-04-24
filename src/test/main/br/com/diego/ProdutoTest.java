/**
 * 
 */
package br.com.diego;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import br.com.diego.dao.ProdutoDAO;
import br.com.diego.dao.IProdutoDAO;
import br.com.diego.domain.Produto;

/**
 * 
 */
public class ProdutoTest {

    @Test
    public void cadastrarTest() throws Exception {
        IProdutoDAO dao = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo("01");
        produto.setNome("Produto A");
        produto.setPreco(100);
        Integer qtd = dao.cadastrar(produto);
        assertTrue(qtd == 1);

        Produto produtoBD = dao.consultar(produto.getCodigo());
        assertNotNull(produtoBD);
        assertNotNull(produtoBD.getId());
        assertEquals(produto.getCodigo(), produtoBD.getCodigo());
        assertEquals(produto.getNome(), produtoBD.getNome());
        assertEquals(produto.getPreco(), produtoBD.getPreco());

        Integer qtdDel = dao.excluir(produtoBD);
        assertNotNull(qtdDel);
    }

    @Test
    public void buscarTodosTest() throws Exception {
        IProdutoDAO dao = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo("10");
        produto.setNome("Produto 1");
        produto.setPreco(200);
        Integer countCad = dao.cadastrar(produto);
        assertTrue(countCad == 1);

        Produto produtos = new Produto();
        produtos.setCodigo("20");
        produtos.setNome("Produto 2");
        produtos.setPreco(300);
        Integer countCad2 = dao.cadastrar(produtos);
        assertTrue(countCad2 == 1);

        List<Produto> list = dao.buscarTodos();
        assertNotNull(list);
        assertEquals(2, list.size());

        int countDel = 0;
        for (Produto prod : list) {
            dao.excluir(prod);
            countDel++;
        }
        assertEquals(list.size(), countDel);

        list = dao.buscarTodos();
        assertEquals(list.size(), 0);
    }

    @Test
    public void atualizarTest() throws Exception {
        IProdutoDAO dao = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo("10");
        produto.setNome("Produto Original");
        produto.setPreco(500);
        Integer countCad = dao.cadastrar(produto);
        assertTrue(countCad == 1);

        Produto produtoBD = dao.consultar("10");
        assertNotNull(produtoBD);
        assertEquals(produto.getCodigo(), produtoBD.getCodigo());
        assertEquals(produto.getNome(), produtoBD.getNome());
        assertEquals(produto.getPreco(), produtoBD.getPreco());

        produtoBD.setCodigo("20");
        produtoBD.setNome("Produto Atualizado");
        produtoBD.setPreco(750);
        Integer countUpdate = dao.atualizar(produtoBD);
        assertTrue(countUpdate == 1);

        Produto produtoBD1 = dao.consultar("10");
        assertNull(produtoBD1);

        Produto produtoBD2 = dao.consultar("20");
        assertNotNull(produtoBD2);
        assertEquals(produtoBD.getId(), produtoBD2.getId());
        assertEquals(produtoBD.getCodigo(), produtoBD2.getCodigo());
        assertEquals(produtoBD.getNome(), produtoBD2.getNome());
        assertEquals(produtoBD.getPreco(), produtoBD2.getPreco());

        List<Produto> list = dao.buscarTodos();
        for (Produto prod : list) {
            dao.excluir(prod);
        }
    }
}

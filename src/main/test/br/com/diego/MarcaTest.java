package br.com.diego;

import static org.junit.Assert.assertNotNull;



import org.junit.Test;

import br.com.diego.dao.AcessorioDAO;
import br.com.diego.dao.CarroDAO;
import br.com.diego.dao.MarcaDAO;
import br.com.diego.domain.Acessorio;
import br.com.diego.domain.Carro;
import br.com.diego.domain.Marca;

public class MarcaTest {
	
	@Test
	public void cadastrarMarcaCarroAcessorio() {
	    Marca marca = new Marca();
	    marca.setNome("Marca Teste");
	    
	    Carro carro = new Carro();
	    carro.setNome("Nome do Carro Teste"); 
	    carro.setModelo("Modelo Teste");       
	    carro.setMarca(marca);                 

	    Acessorio acessorio = new Acessorio();
	    acessorio.setNome("Acessorio Teste");
	    acessorio.setMarca(marca);  
	    acessorio.setCarro(carro);  
	    
	    MarcaDAO marcaDAO = new MarcaDAO();
	    CarroDAO carroDAO = new CarroDAO();
	    AcessorioDAO acessorioDAO = new AcessorioDAO();
	    
	    marcaDAO.cadastrar(marca);
	    carroDAO.cadastrar(carro);
	    acessorioDAO.cadastrar(acessorio);

	    assertNotNull(marca.getId());
	    assertNotNull(carro.getId());
	    assertNotNull(acessorio.getId());
	}


}

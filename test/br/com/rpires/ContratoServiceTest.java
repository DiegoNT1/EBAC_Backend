package br.com.rpires;

import br.com.rpires.dao.ContratoDao;
import br.com.rpires.dao.IContratoDao;
import br.com.rpires.dao.mocks.ContratoDaoMock;
import br.com.rpires.service.ContratoService;
import br.com.rpires.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author rodrigo.pires
 */
public class ContratoServiceTest {

    @Test
    public void salvarTest() {
        IContratoDao mockDao = new ContratoDaoMock();
        IContratoService service = new ContratoService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void buscarTest() {
        IContratoDao mockDao = new ContratoDaoMock();
        IContratoService service = new ContratoService(mockDao);
        String retorno = service.buscar();
        Assert.assertEquals("Contrato encontrado", retorno);
    }

    @Test
    public void excluirTest() {
        IContratoDao mockDao = new ContratoDaoMock();
        IContratoService service = new ContratoService(mockDao);
        String retorno = service.excluir();
        Assert.assertEquals("Contrato excluído", retorno);
    }

    @Test
    public void atualizarTest() {
        IContratoDao mockDao = new ContratoDaoMock();
        IContratoService service = new ContratoService(mockDao);
        String retorno = service.atualizar();
        Assert.assertEquals("Contrato atualizado", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDao mockDao = new ContratoDao();
        IContratoService service = new ContratoService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
}
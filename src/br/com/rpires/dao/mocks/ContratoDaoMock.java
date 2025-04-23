package br.com.rpires.dao.mocks;

import br.com.rpires.dao.IContratoDao;

/**
 * @author rodrigo.pires
 */
public class ContratoDaoMock implements IContratoDao {

    @Override
    public void salvar() {

    }

    @Override
    public String buscar() {
        return "Contrato encontrado";
    }

    @Override
    public String excluir() {
        return "Contrato excluído";
    }

    @Override
    public String atualizar() {
        return "Contrato atualizado";
    }
}

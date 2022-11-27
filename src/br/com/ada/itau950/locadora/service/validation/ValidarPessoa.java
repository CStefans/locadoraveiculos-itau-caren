package br.com.ada.itau950.locadora.service.validation;

import br.com.ada.itau950.locadora.entidades.Pessoa;

public interface ValidarPessoa <T extends Pessoa>{

    void validarDocumento(T pessoa);

}

package br.com.ada.itau950.locadora.service.validation;

import br.com.ada.itau950.locadora.entidades.Pessoa;
import br.com.ada.itau950.locadora.entidades.PessoaJuridica;

public class ValidarPessoaJuridica implements ValidarPessoa<PessoaJuridica> {

    @Override
    public void validarDocumento(PessoaJuridica pessoa) {
        pessoa.getCnpj();

        //validar cnpj
    }
}

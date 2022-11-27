package br.com.ada.itau950.locadora.service.validation;

import br.com.ada.itau950.locadora.entidades.Pessoa;
import br.com.ada.itau950.locadora.entidades.PessoaFisica;

public class ValidarPessoaFisica implements ValidarPessoa<PessoaFisica> {

    //fazer o T na interface validarpessoa
    @Override
    public void validarDocumento(PessoaFisica pessoa) {
        pessoa.getCpf();
        //validar cpf
    }


}

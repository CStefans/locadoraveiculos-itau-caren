package br.com.ada.itau950.locadora.service;

import br.com.ada.itau950.locadora.entidades.Locacao;
import br.com.ada.itau950.locadora.entidades.PessoaFisica;
import br.com.ada.itau950.locadora.service.validation.ValidarPessoa;
import br.com.ada.itau950.locadora.service.validation.ValidarPessoaFisica;
import br.com.ada.itau950.locadora.service.validation.ValidarPessoaJuridica;

import java.math.BigDecimal;

public class LocacaoService {
    public void salvarLocacao(Locacao locacao) {

        //validacoes (validar cpf, cnpj dataNasc)
        ValidarPessoa validarPessoa =
                (locacao.getCliente() instanceof PessoaFisica) ? new ValidarPessoaFisica() : new ValidarPessoaJuridica();
        validarPessoa.validarDocumento((locacao.getCliente()));

        //data locacao menor que devolucao
        //salvar no banco de dados
        //enviar um email para o cliente
    }

    public void recuperarLocacao(Long idLocacao) {
        //buscar a locacao no banco de dados
    }

    public BigDecimal calcularTotalLocacao() {
        //calcular valor da locacao
        return BigDecimal.ZERO;
    }

}

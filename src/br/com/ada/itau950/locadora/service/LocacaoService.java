package br.com.ada.itau950.locadora.service;

import java.math.BigDecimal;

public class LocacaoService {
    public void salvarLocacao() {
        //validacoes (validar cpf, cnpj dataNasc)
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

package br.com.ada.itau950.locadora.repository;

import br.com.ada.itau950.locadora.entidades.Locacao;

public class LocacaoRepository {

    public Locacao salvarLocacao(Locacao locacao){
        //operacao de salvar no BD
        locacao.setIdLocacao((System.currentTimeMillis()));
        return locacao;
    }

    public Locacao recuperarLocacao(Long idLocacao){
        //select no BD
        Locacao locacao = new Locacao();
        locacao.setIdLocacao((idLocacao));
        return new Locacao();
    }

}

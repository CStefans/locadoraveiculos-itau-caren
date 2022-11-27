package br.com.ada.itau950.locadora.entidades;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Locacao {

    private Long idLocacao;
    private Pessoa cliente;
    private Veiculo veiculo;
    private LocalDateTime dataHoraLocacao;
    private LocalDateTime dataHoraDevolucao;

    public Locacao() {
    }

    public Locacao(Pessoa cliente, Veiculo veiculo, LocalDateTime dataHoraLocacao, LocalDateTime dataHoraDevolucao) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.dataHoraLocacao = dataHoraLocacao;
        this.dataHoraDevolucao = dataHoraDevolucao;
    }

    public void setIdLocacao(Long idLocacao) {
        this.idLocacao = idLocacao;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public LocalDateTime getDataHoraLocacao() {
        return dataHoraLocacao;
    }

    public LocalDateTime getDataHoraDevolucao() {
        return dataHoraDevolucao;
    }

}


package br.com.ada.itau950.locadora.entidades;

import java.time.LocalDate;

public class PessoaFisica extends Pessoa {

    private String cpf;
    private LocalDate dataNascimento;



    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}

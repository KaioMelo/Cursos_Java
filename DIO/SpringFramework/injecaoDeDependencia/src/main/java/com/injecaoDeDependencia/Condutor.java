package com.injecaoDeDependencia;

import org.springframework.beans.factory.annotation.Autowired;

public class Condutor {

    public static void main(String[] args) {
        Condutor condutor = new Condutor(new Carro());
        Condutor.automovel();
    }
    @Autowired
    private Veiculo veiculo;

    public Condutor(veiculo obj){
        this.veiculo = obj;
    }

    public void automovel(){
        veiculo.acao();
    }
}

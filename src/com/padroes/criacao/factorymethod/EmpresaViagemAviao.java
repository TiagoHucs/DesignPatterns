package com.padroes.criacao.factorymethod;

public class EmpresaViagemAviao extends EmpresaViagem {

    @Override
    Passagem emitePassagem() {
        return new PassagemAviao();
    }
}

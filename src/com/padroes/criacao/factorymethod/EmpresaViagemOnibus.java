package com.padroes.criacao.factorymethod;

public class EmpresaViagemOnibus extends EmpresaViagem {

    @Override
    Passagem emitePassagem() {
        return new PassagemOnibus();
    }
}

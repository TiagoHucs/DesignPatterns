package com.padroes.criacao.abstractfactory;

public class EmpresaViagem extends Empresa {

    @Override
    Passagem emitePassagemAviao() {
        return new PassagemAviao();
    }

    @Override
    Passagem emitePassagemOnibus() {
        return new PassagemOnibus();
    }
}

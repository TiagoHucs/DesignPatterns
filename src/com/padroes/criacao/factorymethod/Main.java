package com.padroes.criacao.factorymethod;

public class Main {

    public static void main(String[] args) {
        EmpresaViagem gol = new EmpresaViagemAviao();
        EmpresaViagem vavatur = new EmpresaViagemOnibus();
        Passagem passagemGOl = gol.emitePassagem();
        System.out.println("A gol emitiu pasagem do tipo: " + passagemGOl.getClass().getName());
        Passagem vavaturPassagem = vavatur.emitePassagem();
        System.out.println("A Vavatur emitiu pasagem do tipo: " + vavaturPassagem.getClass().getName());

    }
}

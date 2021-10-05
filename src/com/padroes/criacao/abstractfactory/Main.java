package com.padroes.criacao.abstractfactory;

public class Main {

    public static void main(String[] args) {
        Empresa empresa = new EmpresaViagem();
        Passagem passAereo = empresa.emitePassagemAviao();
        System.out.println("Emitiu passagem do tipo: " + passAereo.getClass().getName());
        Passagem passOnibus = empresa.emitePassagemOnibus();
        System.out.println("Emitiu passagem do tipo: " + passOnibus.getClass().getName());

    }
}

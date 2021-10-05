package com.padroes.criacao.singleton;

public class Main {

    public static void main(String[] args) {
        Janela j1 = Janela.getInstance();
        j1.pack();
        j1.setVisible(true);

        Janela j2 = Janela.getInstance();
        j2.pack();
        j2.setVisible(true);
    }
}

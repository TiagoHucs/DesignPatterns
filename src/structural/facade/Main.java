package structural.facade;

import structural.facade.sistemas.ControleDosSistemasFacade;

class Main {

    public static void main(String[] args){
        ControleDosSistemasFacade controleDosSistemas = new ControleDosSistemasFacade();

        controleDosSistemas.acionarSistemas("setor A");
        controleDosSistemas.desativarSistemas("setor A");
        controleDosSistemas.acionarSistemas("setor Zero");



    }

}

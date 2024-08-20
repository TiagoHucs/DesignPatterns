package structural.facade.sistemas;

class SistemaDeEnergia {
    void ligar(String compartimento){
        System.out.println("Compartimento "+compartimento+" ligado!");
    }

    void desligar(String compartimento){
        System.out.println("Compartimento "+compartimento+" desligado!");
    }
}

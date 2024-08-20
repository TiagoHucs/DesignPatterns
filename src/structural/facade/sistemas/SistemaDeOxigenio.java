package structural.facade.sistemas;

class SistemaDeOxigenio {
    void pressurizar(String compartimento){
        System.out.println("Compartimento "+compartimento+" pressurizado!");
    }

    void despressurizar(String compartimento){
        System.out.println("Compartimento "+compartimento+" despressurizado!");
    }
}

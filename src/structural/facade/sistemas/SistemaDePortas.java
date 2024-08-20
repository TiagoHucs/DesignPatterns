package structural.facade.sistemas;

class SistemaDePortas {
    void fecharPortas(String compartimento){
        System.out.println("Compartimento "+compartimento+" fechado!");
    }

    void abrirPortas(String compartimento){
        System.out.println("Compartimento "+compartimento+" aberto!");
    }
}

package structural.facade.sistemas;

public class ControleDosSistemasFacade {

    private SistemaDeEnergia sistemaDeEnergia;
    private SistemaDeOxigenio sistemaDeOxigenio;
    private SistemaDePortas sistemaDePortas;

    public ControleDosSistemasFacade() {
        this.sistemaDeEnergia = new SistemaDeEnergia();
        this.sistemaDeOxigenio = new SistemaDeOxigenio();
        this.sistemaDePortas = new SistemaDePortas();
    }

    public void acionarSistemas(String compartimento){
        this.sistemaDeEnergia.ligar(compartimento);
        this.sistemaDePortas.fecharPortas(compartimento);
        this.sistemaDeOxigenio.pressurizar(compartimento);
    }


    public  void desativarSistemas(String compartimento){
        this.sistemaDeOxigenio.despressurizar(compartimento);
        this.sistemaDePortas.abrirPortas(compartimento);
        this.sistemaDeEnergia.desligar(compartimento);
    }

}

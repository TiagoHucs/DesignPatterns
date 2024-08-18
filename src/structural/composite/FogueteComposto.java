package structural.composite;

import java.util.ArrayList;
import java.util.List;

class FogueteComposto implements ComponenteFoguete{

    private final String nome;
    private List<ComponenteFoguete> componentes = new ArrayList<>();

    public FogueteComposto(String nome) {
        this.nome = nome;
    }

    public void addComponente(ComponenteFoguete componenteFoguete){
        this.componentes.add(componenteFoguete);
    }

    public void delComponente(ComponenteFoguete componenteFoguete){
        this.componentes.remove(componenteFoguete);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Foguete: " + nome);
        for (ComponenteFoguete componenteFoguete: componentes){
            componenteFoguete.exibirDetalhes();
        }
    }




}

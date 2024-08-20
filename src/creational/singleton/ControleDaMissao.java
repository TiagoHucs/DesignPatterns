package creational.singleton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ControleDaMissao {

    private static ControleDaMissao uniqueInstance;
    private List<String> dados = new ArrayList<>();

    public static ControleDaMissao getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new ControleDaMissao();
        }
        return uniqueInstance;
    }

    public void adicionaDado(String dado){
        dados.add(dado);
    }

    public List<String> getDados(){
        return dados;
    }
}

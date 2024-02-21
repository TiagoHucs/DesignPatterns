package com.padroes.comportamentais.strategy.solution;

import java.math.BigDecimal;

public class PessoaJuridicaStrategy implements CalculoStrategy{

    @Override
    public BigDecimal calcular() {
        // Implemente aqui a lógica de cálculo para pessoa física
        return BigDecimal.ONE;
    }

}

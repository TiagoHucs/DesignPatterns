package com.padroes.comportamentais.strategy.solution;

import java.math.BigDecimal;

public class CalculoService {

    private CalculoStrategy calculoStrategy;

    public CalculoService(CalculoStrategy calculoStrategy) {
        this.calculoStrategy = calculoStrategy;
    }

    public BigDecimal getValor(){
        return calculoStrategy.calcular();
    }
}

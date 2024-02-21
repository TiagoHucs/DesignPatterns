package com.padroes.comportamentais.strategy.solution;

import java.math.BigDecimal;

public class PessoaFisicaStrategy implements CalculoStrategy{

    @Override
    public BigDecimal calcular() {
        return BigDecimal.ONE;
    }

}

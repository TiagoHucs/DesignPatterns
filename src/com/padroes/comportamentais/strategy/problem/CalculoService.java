package com.padroes.comportamentais.strategy.problem;

import java.math.BigDecimal;

public class CalculoService {

    public BigDecimal getValor(){
        if(isPessoaJuridica()){
            if(isCalculoComTaxaA() || isCalculoComTaxaB()){
                return calculoAlpha();
            } else if(isCalculoComTaxaC()){
                return calculoBravo();
            }
        } else if(isPessoaFisica()){
            if(isCalculoComTaxaA() || isCalculoComTaxaB()){
                return calculoCharlie();
            } else if(isCalculoComTaxaC()){
                return calculoDelta();
            }
        }
        return BigDecimal.ZERO;
    }

    private boolean isPessoaJuridica(){
        return true;
    }

    private boolean isPessoaFisica(){
        return true;
    }

    private boolean isCalculoComTaxaA(){
        return true;
    }

    private boolean isCalculoComTaxaB(){
        return true;
    }

    private boolean isCalculoComTaxaC(){
        return true;
    }

    private BigDecimal calculoAlpha(){
        return BigDecimal.ONE;
    }

    private BigDecimal calculoCharlie(){
        return BigDecimal.ONE;
    }

    private BigDecimal calculoBravo(){
        return BigDecimal.ONE;
    }

    private BigDecimal calculoDelta(){
        return BigDecimal.ONE;
    }
}

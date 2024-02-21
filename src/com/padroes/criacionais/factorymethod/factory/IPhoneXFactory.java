package com.padroes.criacionais.factorymethod.factory;

import com.padroes.criacionais.factorymethod.model.IPhone;
import com.padroes.criacionais.factorymethod.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory{
    @Override
    protected IPhone createIPhone() {
        return new IPhoneX();
    }
}

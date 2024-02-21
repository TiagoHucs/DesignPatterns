package com.padroes.criacionais.factorymethod.factory;

import com.padroes.criacionais.factorymethod.model.IPhone;
import com.padroes.criacionais.factorymethod.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory{
    @Override
    protected IPhone createIPhone() {
        return new IPhone11();
    }
}

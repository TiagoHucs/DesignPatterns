package com.padroes.criacionais.factorymethod.factory;

import com.padroes.criacionais.factorymethod.model.IPhone;

public abstract class IPhoneFactory {

    public IPhone orderIPhone(){
        IPhone device = null;
        device = createIPhone();
        device.getHardware();
        return device;
    }

    protected abstract IPhone createIPhone();
}

package com.padroes.criacionais.factorymethod.client;

import com.padroes.criacionais.factorymethod.factory.IPhoneFactory;
import com.padroes.criacionais.factorymethod.factory.IPhoneXFactory;
import com.padroes.criacionais.factorymethod.model.IPhone;

public class Client {
    public static void main(String[] args){
        IPhoneFactory iPhoneFactory = new IPhoneXFactory();

        IPhone iPhone = iPhoneFactory.orderIPhone();
        System.out.println(iPhone.getHardware());
    }
}

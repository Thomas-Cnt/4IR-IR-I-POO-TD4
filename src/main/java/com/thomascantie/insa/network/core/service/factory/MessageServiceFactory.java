package com.thomascantie.insa.network.core.service.factory;

public interface MessageServiceFactory<T> {

    T onTCP();

    T onUDP();
}

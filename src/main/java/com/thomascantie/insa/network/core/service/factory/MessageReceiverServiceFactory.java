package com.thomascantie.insa.network.core.service.factory;

import com.thomascantie.insa.network.core.service.MessageReceiverService;
import com.thomascantie.insa.network.core.service.TCPMessageReceiverService;
import com.thomascantie.insa.network.core.service.UDPMessageReceiverService;

public class MessageReceiverServiceFactory implements MessageServiceFactory<MessageReceiverService> {
    @Override
    public MessageReceiverService onTCP() {
        return new TCPMessageReceiverService();
    }

    @Override
    public MessageReceiverService onUDP() {
        return new UDPMessageReceiverService();
    }
}

package com.thomascantie.insa.network.core.service;


import java.net.ServerSocket;

public class TCPMessageReceiverService implements MessageReceiverService {

    @Override
    public void listenOnPort(int port, IncomingMessageListener incomingMessageListener) throws Exception {

        ServerSocket server = new ServerSocket(port);

        Thread accept = new Thread(new AcceptClients(server, incomingMessageListener));
        accept.start();

    }

}

package com.thomascantie.insa.network.core.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPMessageReceiverService implements MessageReceiverService {

    @Override
    public void listenOnPort(int port, IncomingMessageListener incomingMessageListener) throws Exception {

        ServerSocket server = new ServerSocket(port);

        Socket socket = server.accept();

        InputStreamReader stream = new InputStreamReader(socket.getInputStream());

        BufferedReader reader = new BufferedReader(stream);

        incomingMessageListener.onNewIncomingMessage(reader.readLine());

    }

}

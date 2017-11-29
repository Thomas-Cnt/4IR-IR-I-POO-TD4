package com.thomascantie.insa.network.core.service;

import java.io.PrintWriter;
import java.net.*;

public class TCPMessageSenderService implements MessageSenderService {

    @Override
    public void sendMessageOn(String ipAddress, int port, String message) throws Exception {
        Socket socket = new Socket();

        socket.connect(new InetSocketAddress(ipAddress, port)); // asks for a connection

        PrintWriter out = new PrintWriter(socket.getOutputStream());
        out.println(message);
        out.flush();

        socket.close();
    }

}
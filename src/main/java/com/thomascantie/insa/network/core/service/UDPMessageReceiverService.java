package com.thomascantie.insa.network.core.service;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPMessageReceiverService implements MessageReceiverService {

    @Override
    public void listenOnPort(int port, IncomingMessageListener incomingMessageListener) throws Exception {
		DatagramSocket socket = new DatagramSocket(port);

		while(true) {
			byte[] buffer = new byte[8196];

			DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
			socket.receive(packet);

			incomingMessageListener.onNewIncomingMessage(new String(buffer));
		}
    }

}

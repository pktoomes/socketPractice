package com.company;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
	// write your code here
        try{
            System.out.println("waiting for client");
            ServerSocket ss = new ServerSocket(9800);
            //implements a server socket bound to port 9800, used for accepting incoming client connections
            Socket soc = ss.accept();
            //as soon as a client connection is accepted, it wil return a socket object
            System.out.println("connection established");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}

package com.company;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {

    public static void main(String[] args) {
	// write your code here
        try{
            ServerSocket ss = new ServerSocket(9800);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}

package com.company;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try{
            System.out.println("client initiated");
            Socket soc = new Socket("localhost", 9800);
            //bc client and server are on same machine, ip address parameter of Socket is "localhost"
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}

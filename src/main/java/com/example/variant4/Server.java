package com.example.variant4;
import java.net.*;
import java.io.*;
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(3000);
        while (true){
            Socket clientServer = serverSocket.accept();
            System.out.println("Тверь");
            OutputStreamWriter writer = new OutputStreamWriter(clientServer.getOutputStream());
            writer.write("Москва");
            writer.flush();
            writer.close();
            clientServer.close();
        }
    }
}

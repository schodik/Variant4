package com.example.variant4;
import java.net.*;
import java.io.*;
public class Client {
    public static void main(String[] args) throws IOException {
        try (Socket clientSocket = new Socket("127.0.0.1", 3000)){
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String message = reader.readLine();
            System.out.println(message);
        }catch (IOException e){
            System.out.println("ERROR");
        }
    }
}

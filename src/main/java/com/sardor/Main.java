package com.sardor;

import com.sardor.enumeration.HttpVersion;
import com.sardor.enumeration.RequestMethod;
import com.sardor.enumeration.EnumUtils;
import com.sun.net.httpserver.HttpHandler;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

import static com.sardor.utils.Utils.ifValidThenGet;

public class Main {
    public static void main(String[] args) {

    }

    private void echoServerSide() {
        try {

            // listens for TCP connections in the server side
            ServerSocket serverSocket = new ServerSocket(8080);

            // this represents a tcp connection
            Socket clientSocket = serverSocket.accept();

            // just to send bytes to the connected socket
            OutputStream outputStream = clientSocket.getOutputStream();

            // just to get the incoming bytes and send bytes over the socket
            InputStream input = clientSocket.getInputStream();

            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            PrintWriter writer = new PrintWriter(outputStream, true); // auto-flush

            String[] linesArray = reader.lines().toArray(String[]::new);

            String[] requestLine = linesArray[0].split(" ");
            RequestMethod method = RequestMethod.getByNameOrThrow(requestLine[0]);
            String requestURI = ifValidThenGet(requestLine[1]);
            HttpVersion httpVersion = EnumUtils.fromString(HttpVersion.class, requestLine[2]);

            HttpHandler
            switch (method) {
                case GET -> ;
//                case POST -> ;
//                case DELETE -> ;
//                case PUT -> ;
//                default -> ;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void echoClientSide() {
        try {
            // connect as a client
            Socket socket = new Socket("localhost", 8080);

            // reads from the server
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // sends to the server
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            String request = """
                    GET /submit HTTP/1.1
                    Host: localhost:8080
                    Content-Type: application/x-www-form-urlencoded
                    Content-Length: 19
                    """;
            output.println(request);

            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}

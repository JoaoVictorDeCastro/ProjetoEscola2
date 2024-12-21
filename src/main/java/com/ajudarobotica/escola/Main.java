package com.ajudarobotica.escola;

import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpServer;

import com.ajudarobotica.escola.apis.ApiTeste;

public class Main {
    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(9000), 0);
        server.createContext("/test", new ApiTeste());
        server.start();
    }
}
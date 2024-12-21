package com.ajudarobotica.escola.apis;

import java.io.IOException;
import java.io.OutputStream;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class ApiTeste implements HttpHandler  {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String response = "Ok";
        exchange.sendResponseHeaders(200, response.length());
        OutputStream os = exchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
}

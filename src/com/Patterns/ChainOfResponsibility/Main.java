package com.Patterns.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        //authenticator -> logger -> compressor

        Compressor compressor = new Compressor(null);
        Logger logger = new Logger(compressor);
        Authenticator authenticator = new Authenticator(logger);

        WebServer server = new WebServer(authenticator);
        server.handle(new HttpRequest("admin", "1234"));
        System.out.println("--------------------------------------");
        server.handle(new HttpRequest("-", "1234"));
    }
}

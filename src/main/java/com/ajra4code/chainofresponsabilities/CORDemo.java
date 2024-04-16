package com.ajra4code.chainofresponsabilities;

public class CORDemo {

    public static void show() {

        var logger = new Logger(null);
        var compressor = new Compressor(logger);
        var authenticator = new Authenticator(compressor);
        var webServer = new WebServer(authenticator);
        webServer.handle(new HttpRequest("admin", "123"));
    }
}

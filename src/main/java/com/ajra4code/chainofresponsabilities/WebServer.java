package com.ajra4code.chainofresponsabilities;

public class WebServer {

    private Handler handler;


    public WebServer(Handler handler) {
        this.handler = handler;
    }

    //pipeline: authenticator -> compressor -> logger
    public void handle(HttpRequest request) {
        handler.handle(request);

    }
}

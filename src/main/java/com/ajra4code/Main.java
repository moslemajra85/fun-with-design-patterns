package com.ajra4code;

import com.ajra4code.chainofresponsabilities.CORDemo;
import com.ajra4code.realWorldScenario.chainofresponsabilities.Demo;
import org.apache.tika.exception.TikaException;
import org.xml.sax.SAXException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, SAXException, TikaException {

        Demo.show();
     }
}
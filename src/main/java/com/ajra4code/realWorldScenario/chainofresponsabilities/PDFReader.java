package com.ajra4code.realWorldScenario.chainofresponsabilities;

import java.security.cert.Extension;

public class PDFReader extends FileReader{

    public PDFReader(FileReader next) {
        super(next);
    }

    @Override
    protected boolean doRead(String fileName) {
        if(!fileName.endsWith(".pdf")) {
            System.out.println("File Cannot be processed by PDF reader");
            return false;
        }

        System.out.println("PDF Reader");
        return true;

    }



}

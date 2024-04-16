package com.ajra4code.realWorldScenario.chainofresponsabilities;

public class SpreadsheetReader extends FileReader{
    public SpreadsheetReader(FileReader next) {
        super(next);
    }

    @Override
    protected boolean doRead(String fileName) {

        if(!fileName.endsWith(".xslx")) {

            System.out.println("file cannot be processed by SpreadSheet Reader");
            return false;

        }

        System.out.println("SpreadSheet Reader");
        return false;
    }
}

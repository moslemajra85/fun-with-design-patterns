package com.ajra4code.realWorldScenario.chainofresponsabilities;

public class TextFileReader extends  FileReader{
    public TextFileReader(FileReader next) {
        super(next);
    }

    @Override
    protected boolean doRead(String fileName) {

        if(!fileName.endsWith(".txt")) {
            System.out.println("File cannot be processed by TextFileReader");
            return  false;
        }

        System.out.println("TextFileReader");
        return true;
    }
}

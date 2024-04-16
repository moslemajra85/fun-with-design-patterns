package com.ajra4code.realWorldScenario.chainofresponsabilities;

public class DataReader {
    private FileReader reader;

    public DataReader(FileReader reader) {
        this.reader = reader;
    }

    public void read(String fileName) {
        reader.read(fileName);
    }
}

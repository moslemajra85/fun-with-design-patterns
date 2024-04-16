package com.ajra4code.realWorldScenario.chainofresponsabilities;

 import org.apache.tika.exception.TikaException;
 import org.xml.sax.SAXException;

import java.io.IOException;

public class DataReader {
    private FileReader reader;

    public DataReader(FileReader reader) {
        this.reader = reader;
    }

    public void read(String fileName) throws IOException, SAXException, TikaException {
        reader.read(fileName);
    }

}

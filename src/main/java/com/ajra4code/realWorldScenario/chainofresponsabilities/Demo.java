package com.ajra4code.realWorldScenario.chainofresponsabilities;

 import org.apache.tika.exception.TikaException;
 import org.xml.sax.SAXException;

import java.io.IOException;

public class Demo {

    public static void show() throws IOException, SAXException, TikaException {

        var pdfReader = new PDFReader(null);
        var spreadSheetReader = new SpreadsheetReader(pdfReader);
        var textReader = new TextFileReader(spreadSheetReader);
        var dataReader = new DataReader(textReader);
        dataReader.read( "/home/moslem/Documents/myfile.pdf");
    }
}

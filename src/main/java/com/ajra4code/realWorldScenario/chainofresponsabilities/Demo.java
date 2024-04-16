package com.ajra4code.realWorldScenario.chainofresponsabilities;

public class Demo {

    public static void show() {

        var pdfReader = new PDFReader(null);
        var spreadSheetReader = new SpreadsheetReader(pdfReader);
        var dataReader = new DataReader(spreadSheetReader);
        dataReader.read("file.pdf");

    }
}

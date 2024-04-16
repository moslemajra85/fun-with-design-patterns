package com.ajra4code.realWorldScenario.chainofresponsabilities;

public class Demo {

    public static void show() {

        var pdfReader = new PDFReader(null);
        var spreadSheetReader = new SpreadsheetReader(pdfReader);
        var textReader = new TextFileReader(spreadSheetReader);
        var dataReader = new DataReader(textReader);
        dataReader.read("file.pdf");

    }
}

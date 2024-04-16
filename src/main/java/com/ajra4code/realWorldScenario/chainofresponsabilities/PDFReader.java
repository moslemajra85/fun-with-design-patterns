package com.ajra4code.realWorldScenario.chainofresponsabilities;


import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.pdf.PDFParser;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class PDFReader extends FileReader {

    public PDFReader(FileReader next) {
        super(next);
    }

    @Override
    protected boolean doRead(String fileName) throws IOException, SAXException, TikaException {
        if (!fileName.endsWith(".pdf")) {
            System.out.println("File Cannot be processed by PDF reader");
            return false;
        }

        System.out.println("PDF Reader");
        parseToString(fileName);
        return true;

    }

    private void parseToString(String fileName) throws IOException, TikaException, SAXException {
         BodyContentHandler ch = new BodyContentHandler();
         File fl = new File(fileName);
         FileInputStream fs = new FileInputStream(fl);
         Metadata md = new Metadata();
         ParseContext pc = new ParseContext();
         PDFParser pp = new PDFParser();
         pp.parse(fs, ch, md, pc);
         String str = ch.toString();
         System.out.println(str);
    }

}

package com.ajra4code.realWorldScenario.chainofresponsabilities;

public abstract class FileReader {
    private FileReader next;

    public FileReader(FileReader next) {
        this.next = next;
    }


    public void read(String fileName) {

        if(doRead(fileName)) {
            return;
        }


        else if(next != null) {
            next.read(fileName);
        }else {
            throw new UnsupportedOperationException("File is no supported");
        }

    }
    protected abstract boolean doRead(String fileName);


}

package com.app.obiektowosc_8_i.wrong;

public class FileOperationsImpl implements FileOperations {
    @Override
    public String readFile(String filename) {
        return null;
    }

    @Override
    public void writeFile(String filename, String content) {

    }

    @Override
    public void deleteFile(String filename) {
        throw new UnsupportedOperationException("...");
    }
}

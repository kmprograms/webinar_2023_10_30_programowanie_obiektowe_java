package com.app.obiektowosc_8_i.wrong;

public interface FileOperations {
    String readFile(String filename);
    void writeFile(String filename, String content);
    void deleteFile(String filename);
}

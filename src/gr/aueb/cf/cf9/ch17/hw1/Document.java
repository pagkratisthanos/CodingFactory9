package gr.aueb.cf.cf9.ch17.hw1;

import java.util.LinkedList;

public class Document {

    private String fileName;
    private LinkedList<Character> content;

    public Document() {};

    public Document(String fileName, LinkedList<Character> content) {
        this.fileName = fileName;
        this.content = content;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public LinkedList<Character> getContent() {
        return content;
    }

    public void setContent(LinkedList<Character> content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Document{" +
                "fileName='" + fileName + '\'' +
                ", characters=" + content.size() +
                '}';
    }
}

package gr.aueb.cf.cf9.ch4;

import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {
        int inputChar = ' ';

        System.out.println("Please Insert an ASCII char");
        inputChar = System.in.read();

        System.out.println("char: " + (char)inputChar);
    }
}

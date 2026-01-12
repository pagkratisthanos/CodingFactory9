package gr.aueb.cf.cf9.ch16.hw1;

public interface Printable {
    default void print() {
        System.out.println("Default printing...");
    }
}
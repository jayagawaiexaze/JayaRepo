package testcases;

import org.junit.Test;

public class HelloProgram {

    @Test
    public void printMessage() {
        System.out.println("Hello World");
        System.out.println(System.getProperty("url"));
        System.out.println(System.getProperty("username"));
        System.out.println(System.getProperty("password"));
    }
}





package testcases;

import io.github.cdimascio.dotenv.Dotenv;
import org.junit.Test;

public class HelloProgram {

    @Test
    public void printMessage() {
        System.out.println("Hello World");
        Dotenv dotenv = Dotenv.load();
        System.out.println(dotenv.get("username"));
        System.out.println(dotenv.get("password"));
    }
}





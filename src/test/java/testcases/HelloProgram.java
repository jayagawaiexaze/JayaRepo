package testcases;

import io.github.cdimascio.dotenv.Dotenv;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class HelloProgram {

    @Test
    public void printMessage() {
        System.out.println("Hello World");
        Dotenv dotenv = Dotenv.load();
        String userName = dotenv.get("USERNAME1");//userName=jayag@mailinator.com

        System.out.println(dotenv.get("USERNAME1"));
        System.out.println(dotenv.get("PASSWORD1"));

        Properties properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/test/resources/config.properties");
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Get values from properties file
        properties.setProperty("username", userName);

        System.out.println(properties.getProperty("username"));

    }
}





package main.java.com.veventmgmt.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class EventMain {
    public static void main(String[]args){
        SpringApplication.run(EventMain.class, args);

        System.out.println("Completed");
    }
}

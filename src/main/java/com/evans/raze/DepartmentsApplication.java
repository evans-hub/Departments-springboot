package com.evans.raze;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DepartmentsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DepartmentsApplication.class, args);
        System.out.println("Started successfully in port 9001");
    }

}

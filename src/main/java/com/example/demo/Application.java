package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository){
        return args -> {
            Employee lovine =new Employee(
                    "lovine",
                    "Jenny",
                    "jenny@gmail.com",
                    22
            );
            employeeRepository.save(lovine);

        };
    }

}

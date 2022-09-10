package com.labcorp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.IntStream;

@SpringBootApplication
public class EmployeeApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmployeeApplication.class, args);
    }

    @Bean
    CommandLineRunner init(EmployeeRepository employeeRepo) {
        return args -> {
            IntStream.rangeClosed(1, 10).forEach(e -> {
                employeeRepo.save(new HourlyEmployee());
                employeeRepo.save(new SalariedEmployee());
                employeeRepo.save(new ManagerEmployee());
            });
            employeeRepo.findAll().forEach(System.out::println);
        };
    }
}
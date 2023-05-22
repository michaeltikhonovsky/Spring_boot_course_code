package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.DECEMBER;
import static java.time.Month.OCTOBER;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student michael = new Student(1L, "Michael", "michael@gmail.com", LocalDate.of(2002, DECEMBER, 20));
            Student alex = new Student( "Alex", "alex@gmail.com", LocalDate.of(1989, OCTOBER, 10));
            repository.saveAll(List.of(michael, alex));
        };
    }
}

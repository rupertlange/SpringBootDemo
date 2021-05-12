package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student rupert = new Student(
                    1L,
                    "Rupert",
                    "rupertlange7@gmail.com",
                    LocalDate.of(1998, Month.JULY,15)
            );
            Student haynes = new Student(
                    2L,
                    "Haynes",
                    "hay.mey193@gmail.com",
                    LocalDate.of(1999, Month.MAY,29)
            );

            repository.saveAll(
                    List.of(rupert, haynes)
            );

        };
    }
}

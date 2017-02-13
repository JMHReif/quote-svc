package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class QuoteSvcApplication {
    @Bean
    CommandLineRunner createBean(QuoteRepository quoteRepository) {
        return strings -> {
            quoteRepository.save(new Quote("This is quote 1", "Author 1"));
            quoteRepository.save(new Quote("This is quote 2", "Author 2"));
            quoteRepository.save(new Quote("This is quote 3", "Author 3"));

            quoteRepository.findAll().forEach(System.out::println);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(QuoteSvcApplication.class, args);
    }
}

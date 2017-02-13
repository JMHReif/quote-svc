package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jennifer on 2/13/17.
 */
@RestController
public class QuoteController {
//    private QuoteRepository quoteRepository;
//
//    public QuoteController(QuoteRepository quoteRepository) {
//        this.quoteRepository = quoteRepository;
//    }

    @Autowired
    private QuoteRepository quoteRepository;

    @GetMapping("/random")
    public Quote getRandomQuote() {
        return this.quoteRepository.getQuotesRandomOrder().get(0);
    }
}

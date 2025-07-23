package com.example.quoteapi.service;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class QuoteService {
    private final List<String> quotes = List.of(
        "The only way to do great work is to love what you do. - Steve Jobs",
        "Success is not final, failure is not fatal: It is the courage to continue that counts. - Winston Churchill",
        "Believe you can and you're halfway there. - Theodore Roosevelt"
    );

    public String getRandomQuote() {
        return quotes.get(new Random().nextInt(quotes.size()));
    }
}

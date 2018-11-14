package com.hendisantika.springbootquotes.controller;

import com.hendisantika.springbootquotes.model.Quote;
import com.hendisantika.springbootquotes.repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-quotes
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 15/11/18
 * Time: 06.31
 */
@RestController
@RequestMapping("/quotes")
public class QuoteController {

    @Autowired
    QuoteRepository quoteRepository;

    @GetMapping
    public List<Quote> getAllQuotes() {
        return quoteRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    @ResponseBody
    public ResponseEntity<Quote> getQuote(@PathVariable String id) {
        return quoteRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping(value = "/random")
    public Quote getRandomQuote() {
        return quoteRepository.findRandom();
    }

    @PostMapping
    public Quote createQuote(@RequestBody Quote quote) {
        return quoteRepository.save(quote);
    }

    @DeleteMapping(value = "/{id}")
    public void removeQuote(@PathVariable String id) {
        quoteRepository.deleteById(id);
    }

    @DeleteMapping
    public void clearQuotes() {
        quoteRepository.deleteAll();
    }
}
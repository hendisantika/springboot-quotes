package com.hendisantika.springbootquotes.repository;

import com.hendisantika.springbootquotes.model.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;
import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-quotes
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 15/11/18
 * Time: 06.30
 */
public class QuoteRepositoryImpl implements QuoteRepositoryCustom {

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public Quote findRandom() {
        Query query = new BasicQuery("{}");
        long total = mongoTemplate.count(query, Quote.class);
        int random = new Random().nextInt((int) total);
        List<Quote> quotes = mongoTemplate.findAll(Quote.class);

        return quotes.get(random);
    }
}
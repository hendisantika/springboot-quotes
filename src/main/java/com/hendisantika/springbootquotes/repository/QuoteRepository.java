package com.hendisantika.springbootquotes.repository;

import com.hendisantika.springbootquotes.model.Quote;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-quotes
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 15/11/18
 * Time: 06.28
 */
public interface QuoteRepository extends MongoRepository<Quote, String>, QuoteRepositoryCustom {

    Quote findRandom();
}
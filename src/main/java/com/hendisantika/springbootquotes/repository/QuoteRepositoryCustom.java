package com.hendisantika.springbootquotes.repository;

import com.hendisantika.springbootquotes.model.Quote;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-quotes
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 15/11/18
 * Time: 06.29
 */
public interface QuoteRepositoryCustom {

    Quote findRandom();

}

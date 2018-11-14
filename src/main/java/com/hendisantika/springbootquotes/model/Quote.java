package com.hendisantika.springbootquotes.model;

import lombok.Data;
import lombok.ToString;
import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-quotes
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 15/11/18
 * Time: 06.27
 */
@Data
@ToString
public class Quote {
    @Id
    private String id;

    private String author;

    private String text;

    private DateTime date;
}

package com.kodilla.kodillaspringtraining.forum;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ForumUserTestSuite {
    @Test
    public void testGetUsername() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.kodillaspringtraining.forum");
        ForumUser forumUser = context.getBean(ForumUser.class);

        String username = forumUser.username;

        Assert.assertEquals("John Smith", username);
    }
}

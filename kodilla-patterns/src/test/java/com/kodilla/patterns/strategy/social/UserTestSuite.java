package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        User millenials = new Millenials("Millenials");
        User ygen = new YGeneration("Y Generation");
        User zgen = new ZGeneration("Z Generation");

        String millenialsPublisher = millenials.sharePost();
        System.out.println("Millenials User use: " + millenialsPublisher);
        String ygenPublisher = ygen.sharePost();
        System.out.println("Y Generation User use: " + ygenPublisher);
        String zgenPublisher = zgen.sharePost();
        System.out.println("Z Generation User use: " + zgenPublisher);

        Assert.assertEquals("Facebook", millenialsPublisher);
        Assert.assertEquals("Twitter", ygenPublisher);
        Assert.assertEquals("Snapchat", zgenPublisher);
    }

    @Test
    public void testIndividualSharingStrategy() {

        User millenials = new Millenials("Millenials");

        String millenialsDefaultPublisher = millenials.sharePost();
        System.out.println("Millenials User usually use: " + millenialsDefaultPublisher);
        millenials.setSocialPublisher(new SnapchatPublisher());
        String millenialsNowUse = millenials.sharePost();
        System.out.println("Millenials User now use: " + millenialsNowUse);

        Assert.assertEquals("Snapchat", millenialsNowUse);

    }
}

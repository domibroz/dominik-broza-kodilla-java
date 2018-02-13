package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog(){

        Logger.getInstance().log("First log");

        String actualLastLog = Logger.getInstance().getLastLog();

        Assert.assertEquals("First log", actualLastLog);
    }
}

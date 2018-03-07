package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

@Test
    public void getLastLog() {
    //Given
    String logText = "Error 404";
    //When
    Logger.getInstance().log(logText);
    //Then
    Assert.assertFalse(Logger.getInstance().getLastLog().isEmpty());
}
}

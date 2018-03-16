package com.kodilla.kodillapatterns2_2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class HomeworkTestSuite {
    @Test
    public void testUpdate(){
        //given
        Mentor janKowalski = new Mentor("Jan Kowalski");
        User krzysztof = new User("Krzysztof Nowak");
        User hubert = new User("Hubert Sokol");
        krzysztof.registerObserver(janKowalski);
        hubert.registerObserver(janKowalski);
        //when
        krzysztof.newHomework("1.1");
        krzysztof.newHomework("1.2");
        krzysztof.newHomework("1.3");
        hubert.newHomework("2.1");
        hubert.newHomework("2.2");
        int counter = janKowalski.getHomeworksCounter();
        //then
        Assert.assertEquals(5,counter);

    }
}

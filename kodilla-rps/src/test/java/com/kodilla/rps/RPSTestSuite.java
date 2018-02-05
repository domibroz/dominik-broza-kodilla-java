package com.kodilla.rps;

import org.junit.Assert;
import org.junit.Test;

public class RPSTestSuite {
    @Test
    public void testSingleClass() {
        Single single = new Single();

        SingleResult drawResult = single.run(Choice.ROCK, Choice.ROCK);
        SingleResult userWonResult = single.run(Choice.SCISSORS, Choice.PAPER);
        SingleResult compWonResult = single.run(Choice.SCISSORS, Choice.ROCK);

        Assert.assertEquals(SingleResult.draw(), drawResult);
        Assert.assertEquals(SingleResult.user(), userWonResult);
        Assert.assertEquals(SingleResult.comp(), compWonResult);
    }

    @Test
    public void testWon(){
        boolean rockScissors =  Choice.ROCK.won(Choice.SCISSORS);
        boolean scissorsRock = Choice.SCISSORS.won(Choice.ROCK);
        boolean rockPaper = Choice.ROCK.won(Choice.PAPER);
        boolean paperRock = Choice.PAPER.won(Choice.ROCK);
        boolean paperScissors = Choice.PAPER.won(Choice.SCISSORS);
        boolean scissorsPaper = Choice.SCISSORS.won(Choice.PAPER);

        Assert.assertEquals(true, rockScissors);
        Assert.assertEquals(false, scissorsRock);
        Assert.assertEquals(false, rockPaper);
        Assert.assertEquals(true,paperRock);
        Assert.assertEquals(false,paperScissors);
        Assert.assertEquals(true,scissorsPaper);

    }
}

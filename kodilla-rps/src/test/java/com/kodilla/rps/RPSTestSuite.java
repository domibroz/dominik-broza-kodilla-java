package com.kodilla.rps;

import org.junit.Assert;
import org.junit.Test;

public class RPSTestSuite {
    @Test
    public void testSingleClass() {
        Round round = new Round();

        RoundResult drawResult = round.run(Choice.ROCK, Choice.ROCK);
        RoundResult userWonResult = round.run(Choice.SCISSORS, Choice.PAPER);
        RoundResult compWonResult = round.run(Choice.SCISSORS, Choice.ROCK);

        Assert.assertEquals(RoundResult.draw(), drawResult);
        Assert.assertEquals(RoundResult.user(), userWonResult);
        Assert.assertEquals(RoundResult.comp(), compWonResult);
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

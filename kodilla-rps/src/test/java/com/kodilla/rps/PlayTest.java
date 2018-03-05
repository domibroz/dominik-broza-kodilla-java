package com.kodilla.rps;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.CharBuffer;

import static org.mockito.Mockito.*;

public class PlayTest {
    @Test
    public void testIsGameCompletedWhenUserWon() {
        Play play = new Play(null, null);
        boolean result = play.isGameCompleted(5, 5, Player.USER);
        Assert.assertTrue(result);
    }

    @Test
    public void testIsGameCompletedWhenCompWon() {
        Play play = new Play(null, null);
        boolean result = play.isGameCompleted(5, 5, Player.COMPUTER);
        Assert.assertTrue(result);
    }

    @Test
    public void testIsGameInProgress() {
        Play play = new Play(null, null);
        boolean result = play.isGameCompleted(5, 2, Player.USER);
        Assert.assertFalse(result);
    }

    @Test
    public void testFinishGameWhenUserRequested() {
        Play play = new Play(simulateUserInput("X", "YES"), null);
        play.rpsRun(4);


    }

    @Test
    public void testUserWon() {
        Play play = new Play(simulateUserInput("p", "p", "p"), simulateChallenger(Choice.ROCK, Choice.ROCK, Choice.ROCK));
        play.rpsRun(3);


    }

    private Readable simulateUserInput(final String... input) {
        return new Readable() {
            @Override
            public int read(CharBuffer cb) throws IOException {
                for (int n = 0; n < input.length; n++) {
                    cb.put(input[n]);
                    cb.put("\n");
                }
                return input.length * 2;
            }
        };
    }

    private Challenger simulateChallenger(Choice... input) {
        Challenger challengerMock = mock(Challenger.class);
        for (int n = 0; n < input.length; n++) {
            when(challengerMock.getChoice()).thenReturn(input[n]);
        }
        return challengerMock;

    }

}
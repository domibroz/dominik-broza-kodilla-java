package com.kodilla.testing.forum.statistics;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticsTestSuite {
    @Test
    public void testCalculateAdvStatistics(){
        Statistics statisticsMock = mock(Statistics.class);
        int postCountMock = 0;
        List<String> userNamesMock = new ArrayList<>();
        int commentCountMock = 0;
        when(statisticsMock.commentsCount()).thenReturn(commentCountMock);
        when(statisticsMock.postsCount()).thenReturn(postCountMock);
        when(statisticsMock.userNames()).thenReturn(userNamesMock);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        double actualAveragePostsPerUser = calculateStatistics.averagePostsPerUser;
        double actualAverageCommentsPerUser = calculateStatistics.averageCommentsPerUser;
        double actualAverageCommentsPerPost = calculateStatistics.averageCommentsPerPost;

        Assert.assertEquals(0.0,actualAverageCommentsPerPost, 0);
        Assert.assertEquals(0.0, actualAverageCommentsPerUser, 0);
        Assert.assertEquals(0.0, actualAveragePostsPerUser, 0);
    }


}

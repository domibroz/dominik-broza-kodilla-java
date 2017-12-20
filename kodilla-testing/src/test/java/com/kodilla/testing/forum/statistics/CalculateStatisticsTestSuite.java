package com.kodilla.testing.forum.statistics;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticsTestSuite {

    private List<String> generateListOfUserNames(int usersQuantity){
        List<String> resultList = new ArrayList<>();
        for(int n = 1; n <= usersQuantity; n++){
            resultList.add("User" + n);
        }
        return resultList;
    }
    @Test
    public void testCalculateAdvStatisticsCase1(){
        Statistics statisticsMock = mock(Statistics.class);
        int postCountMock = 0;
        List<String> userNamesMock = generateListOfUserNames(10);
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

    @Test
    public void testCalculateAdvStatisticsCase2(){
        Statistics statisticsMock = mock(Statistics.class);
        int postCountMock = 0;
        List<String> userNamesMock = generateListOfUserNames(100);
        int commentCountMock = 10;
        when(statisticsMock.commentsCount()).thenReturn(commentCountMock);
        when(statisticsMock.postsCount()).thenReturn(postCountMock);
        when(statisticsMock.userNames()).thenReturn(userNamesMock);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        double actualAveragePostsPerUser = calculateStatistics.averagePostsPerUser;
        double actualAverageCommentsPerUser = calculateStatistics.averageCommentsPerUser;
        double actualAverageCommentsPerPost = calculateStatistics.averageCommentsPerPost;

        Assert.assertEquals(0.0,actualAverageCommentsPerPost, 0);
        Assert.assertEquals(0.1, actualAverageCommentsPerUser, 0);
        Assert.assertEquals(0.0, actualAveragePostsPerUser, 0);
    }

    @Test
    public void testCalculateAdvStatisticsCase3(){
        Statistics statisticsMock = mock(Statistics.class);
        int postCountMock = 1;
        List<String> userNamesMock = generateListOfUserNames(100);
        int commentCountMock = 10;
        when(statisticsMock.commentsCount()).thenReturn(commentCountMock);
        when(statisticsMock.postsCount()).thenReturn(postCountMock);
        when(statisticsMock.userNames()).thenReturn(userNamesMock);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        double actualAveragePostsPerUser = calculateStatistics.averagePostsPerUser;
        double actualAverageCommentsPerUser = calculateStatistics.averageCommentsPerUser;
        double actualAverageCommentsPerPost = calculateStatistics.averageCommentsPerPost;

        Assert.assertEquals(10.0,actualAverageCommentsPerPost, 0);
        Assert.assertEquals(0.1, actualAverageCommentsPerUser, 0);
        Assert.assertEquals(0.01, actualAveragePostsPerUser, 0);
    }

    @Test
    public void testCalculateAdvStatisticsCaseAllZero(){
        Statistics statisticsMock = mock(Statistics.class);
        int postCountMock = 0;
        List<String> userNamesMock = generateListOfUserNames(0);
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

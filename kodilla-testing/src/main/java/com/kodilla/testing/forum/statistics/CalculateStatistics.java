package com.kodilla.testing.forum.statistics;

public class CalculateStatistics{
    int usersCount;
    int postsCount;
    int commentCount;
    double averagePostsPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPost;

    public CalculateStatistics() {
    }

    public void calculateAdvStatistics(Statistics statistics){
        usersCount = statistics.userNames().size();
        postsCount = statistics.postsCount();
        commentCount = statistics.commentsCount();
        if(usersCount > 0.0){
        averagePostsPerUser = postsCount/usersCount;
        averageCommentsPerUser = commentCount/usersCount;
        }
        else {
            averageCommentsPerPost = 0.0;
            averageCommentsPerUser = 0.0;
        }
        if(postsCount > 0.0){
            averageCommentsPerPost = commentCount/postsCount;
        }
        else{
            averageCommentsPerPost = 0.0;
        }


    }

}

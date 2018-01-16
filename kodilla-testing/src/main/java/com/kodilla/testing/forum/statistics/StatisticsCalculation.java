package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.*;

public class StatisticsCalculation implements Statistics {
    Statistics statistics;
    List<String> userList = new ArrayList<>();
    int postsCounter;
    int commentsCounter;
    double avgPostsPerUser;
    double avgCommentsPerUser;
    double avgCommentsPerPosts;

    StatisticsCalculation(Statistics statistics) {
        this.statistics = statistics;
    }

    double getAvgPostsPerUser()

    {
        return avgPostsPerUser;
    }

    double getAvgCommentsPerUser()

    {
        return avgCommentsPerUser;
    }

    double getAvgCommentsPerPosts()

    {
        return avgCommentsPerPosts;
    }

    @Override
    public List<String> usersNames() {
        userList = statistics.usersNames();
        return userList;
    }

    @Override
    public int postsCount() {
        postsCounter = statistics.postsCount();
        return postsCounter;
    }

    @Override
    public int commentsCount() {
        commentsCounter = statistics.commentsCount();
        return commentsCounter;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        if (statistics.postsCount() != 0 && statistics.usersNames().size() != 0) {
            avgPostsPerUser = statistics.postsCount() / statistics.usersNames().size();
        } else {
            avgPostsPerUser = 0;
        }
        if (statistics.commentsCount() != 0 && statistics.usersNames().size() != 0) {
            avgCommentsPerUser = statistics.commentsCount() / statistics.usersNames().size();
        } else {
            avgCommentsPerUser = 0;
        }
        if (statistics.commentsCount() != 0 && statistics.postsCount() != 0) {
            avgCommentsPerPosts = statistics.commentsCount() / statistics.postsCount();
        } else {
            avgCommentsPerPosts = 0;
        }
    }

    public void showStatistics()

    {
        calculateAdvStatistics(statistics);
        System.out.println("Average posts per user:" + getAvgPostsPerUser());
        System.out.println("Average comments per user:" + getAvgCommentsPerUser());
        System.out.println("Average comments per posts:" + getAvgCommentsPerPosts());
    }
}
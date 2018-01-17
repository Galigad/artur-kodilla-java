package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

public class ForumStatisticsSuite {
    private static int testCounter = 0;

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Starting tests:");
    }

    @AfterClass
    public static void afterAllTest() {
        System.out.println("All tests has ended.");
    }

    @Test
    public void testStatisticsNoPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsNumber = 0;
        int commentsNumber = 0;
        List<String> user = new ArrayList<>();
        //When
        StatisticsCalculation noData = new StatisticsCalculation(statisticsMock);
        noData.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, noData.getAvgPostsPerUser(), 0.01);
        Assert.assertEquals(0, noData.getAvgCommentsPerUser(), 0.01);
        Assert.assertEquals(0, noData.getAvgCommentsPerPosts(), 0.01);
    }
    @Test
    public void testStatisticsWithData() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsNumber = 1000;
        int commentsNumber = 10;
        List<String > users = new ArrayList<>();
        for(int i = 0; i<100; i++){
            users.add("user" + i);
        }
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        when(statisticsMock.usersNames()).thenReturn(users);
        //When
        StatisticsCalculation morePostsThenComments = new StatisticsCalculation(statisticsMock);
        morePostsThenComments.calculateAdvStatistics(statisticsMock);
        //Then
        int expectedAvgPosts = statisticsMock.postsCount() / statisticsMock.usersNames().size();
        double postsPerUser = morePostsThenComments.getAvgPostsPerUser();
        Assert.assertEquals(expectedAvgPosts, postsPerUser,0.01);
        int expectedAvgComments = statisticsMock.commentsCount() / statisticsMock.usersNames().size();
        double CommentsPerUser = morePostsThenComments.getAvgCommentsPerUser();
        Assert.assertEquals(expectedAvgComments, CommentsPerUser,0.01);
        int expectedAvgCommPerPost = statisticsMock.commentsCount() / statisticsMock.postsCount();
        double commentsPerPosts = morePostsThenComments.getAvgCommentsPerPosts();
        Assert.assertEquals(expectedAvgCommPerPost, commentsPerPosts,0.01);
    }
    @Test
    public void testStatisticsWithDifferentData() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsNumber = 10;
        int commentsNumber = 1000;
        List<String> users = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            users.add("user" + i);
        }
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        when(statisticsMock.usersNames()).thenReturn(users);
        //When
        StatisticsCalculation moreCommentsThenPosts = new StatisticsCalculation(statisticsMock);
        moreCommentsThenPosts.calculateAdvStatistics(statisticsMock);
        //Then
        int expectedAvgPosts = statisticsMock.postsCount() / statisticsMock.usersNames().size();
        double postsPerUser = moreCommentsThenPosts.getAvgPostsPerUser();
        Assert.assertEquals(expectedAvgPosts, postsPerUser, 0.01);
        int expectedAvgComments = statisticsMock.commentsCount() / statisticsMock.usersNames().size();
        double CommentsPerUser = moreCommentsThenPosts.getAvgCommentsPerUser();
        Assert.assertEquals(expectedAvgComments, CommentsPerUser, 0.01);
        int expectedAvgCommPerPost = statisticsMock.commentsCount() / statisticsMock.postsCount();
        double commentsPerPosts = moreCommentsThenPosts.getAvgCommentsPerPosts();
        Assert.assertEquals(expectedAvgCommPerPost, commentsPerPosts, 0.01);
    }
}

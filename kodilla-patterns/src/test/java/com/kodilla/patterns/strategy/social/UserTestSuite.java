package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.TwitterPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User joanna = new Millenials("Joanna");
        User artur = new YGeneration("Artur");
        User dominik = new ZGeneration("Dominik");

        //When
        String joannaSocialPublisher = joanna.sharePost();
        System.out.println("Joanna " + joannaSocialPublisher);
        String arturSocialPublisher = artur.sharePost();
        System.out.println("Artur " + arturSocialPublisher);
        String dominikSocialPublisher = dominik.sharePost();
        System.out.println("Dominik " + dominikSocialPublisher);

        //Then
        Assert.assertEquals("you just posted on Facebook thanks to Facebook publisher.", joannaSocialPublisher);
        Assert.assertEquals("you just posted on Twitter thanks to Twitter publisher.", arturSocialPublisher);
        Assert.assertEquals("you just posted on Snapchat thanks to Snapchat publisher.", dominikSocialPublisher);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User agnieszka = new Millenials("Agnieszka");

        //When
        String agnieszkaSocialPublisher = agnieszka.sharePost();
        System.out.println("Agnieszka " + agnieszkaSocialPublisher);
        agnieszka.setSocialPublisher(new TwitterPublisher());
        agnieszkaSocialPublisher = agnieszka.sharePost();
        System.out.println("Agnieszka you have changed Facebook publisher and " + agnieszkaSocialPublisher);

        //Then
        Assert.assertEquals("you just posted on Twitter thanks to Twitter publisher.", agnieszkaSocialPublisher);
    }
}
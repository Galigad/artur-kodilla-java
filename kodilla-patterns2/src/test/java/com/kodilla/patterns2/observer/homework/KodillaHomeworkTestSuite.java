package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class KodillaHomeworkTestSuite {
    @Test
    public void testHomework() {
        //Given
        HomeworkQueue queue1 = new HomeworkQueue("Student 1");
        HomeworkQueue queue2 = new HomeworkQueue("Student 2");
        HomeworkQueue queue3 = new HomeworkQueue("Student 3");

        Mentor mentor1 = new Mentor("Mentor 1");
        Mentor mentor2 = new Mentor("Mentor 2");

        queue1.registerMentor(mentor1);
        queue2.registerMentor(mentor1);
        queue3.registerMentor(mentor2);

        //When
        queue1.addHomework("Solution 1");
        queue2.addHomework("Next exercise solution");
        queue2.addHomework("Solution 3");
        queue3.addHomework("Exercise");
        queue3.addHomework("Another exercise");


        //Then

        Assert.assertEquals(3, mentor1.getUpdateCount());
        Assert.assertEquals(2, mentor2.getUpdateCount());
    }
}

package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(HomeworkQueue homeworkQueue) {
        System.out.println(name + ": have new exercise " + homeworkQueue.getHomeworks() +
                " to check from " + homeworkQueue.getStudent() + "\n +" +
                "(total exercises: " + (updateCount + 1) + ")");
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}

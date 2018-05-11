package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class HomeworkQueue implements Observable {
    private Observer observer;
    private final List<String> homeworks;
    private final String student;

    public HomeworkQueue(String student) {
        homeworks = new ArrayList<>();
        this.student = student;
    }

    public void addHomework(String exercise){
        homeworks.add(exercise);
        notifyMentor();
    }


    @Override
    public void registerMentor(Observer observer) {
        this.observer = observer;
    }

    @Override
    public void notifyMentor() {
        observer.update(this);
    }

    public List<String> getHomeworks() {
        return homeworks;
    }

    public String getStudent() {
        return student;
    }
}

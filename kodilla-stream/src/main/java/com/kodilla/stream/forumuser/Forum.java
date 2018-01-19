package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser(001, "Artur", 'M', 1989, 10, 24, 1));
        theUserList.add(new ForumUser(002, "Dominik", 'M', 2015, 12, 14, 11));
        theUserList.add(new ForumUser(003, "Kuba", 'M', 2010, 3, 6, 21));
        theUserList.add(new ForumUser(004, "Wojtek", 'M', 1890, 6, 9, 421));
        theUserList.add(new ForumUser(005, "Agnieszka", 'F', 1986, 1, 4, 9));
        theUserList.add(new ForumUser(006, "Ewelina", 'F', 1995, 11, 21, 0));
        theUserList.add(new ForumUser(007, "Karolina", 'F', 2007, 10, 16, 6));
        // theUserList.add(new ForumUser(008, "Sabina", 'F', 2017, 1, 2, 97));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(theUserList);
    }
}

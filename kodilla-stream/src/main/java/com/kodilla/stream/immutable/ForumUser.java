package com.kodilla.stream.immutable;

public class ForumUser {
    private String username;
    private String realname;

    private ForumUser(final String username, final String realname) {
        this.username = username;
        this.realname = realname;
    }

    private String getUsername() {
        return username;
    }

    private String getRealname() {
        return realname;
    }
}

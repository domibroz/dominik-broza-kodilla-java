package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
        private final List<ForumUser> userList = new ArrayList<>();
        public Forum(){
        userList.add(new ForumUser(001, "ppearson", 'F', LocalDate.of(1990,10,13), 12));
        userList.add(new ForumUser(002, "jsmith", 'M', LocalDate.of(1980,12,3), 2));
        userList.add(new ForumUser(003, "dnewman", 'F', LocalDate.of(1994,10,13), 122));
        userList.add(new ForumUser(004, "lriley", 'F', LocalDate.of(1960,10,13), 14));
        userList.add(new ForumUser(005, "orogers", 'M', LocalDate.of(1996,2,3), 42));
        userList.add(new ForumUser(006, "mdavies", 'F', LocalDate.of(1935,10,13), 22));
        userList.add(new ForumUser(007, "jkowalski", 'M', LocalDate.of(1985,1,1), 0));
    }

    public List<ForumUser> getUserList() {
        return userList;
    }
}

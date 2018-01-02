package com.kodilla.stream;


import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<Integer, ForumUser> theResultMapOfForum = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex()=='M')
                .filter(forumUser -> forumUser.getAge() > 20)
                .filter(forumUser -> forumUser.getPostCount() >=1)
                .collect(Collectors.toMap(ForumUser::getId,forumUser -> forumUser));

        System.out.println("#elements: "+theResultMapOfForum.size());

        theResultMapOfForum.entrySet().stream()
                .forEach(System.out::println);



    }
}
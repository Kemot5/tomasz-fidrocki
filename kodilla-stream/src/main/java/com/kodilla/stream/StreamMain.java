package com.kodilla.stream;


import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


import static java.time.LocalDate.*;



public class StreamMain {

    public static void main(String[] args) {
        Forum theForum = new Forum();

        Map<Integer, ForumUser> theResultOfMapForum = theForum.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getDateBirth().isBefore(LocalDate.of(1999, 10, 15)))
                .filter(forumUser -> forumUser.getQuantityPost() > 1)
                .collect(Collectors.toMap(ForumUser::getNumberID, forumUser -> forumUser));

        System.out.println(" Element of new Map" + theResultOfMapForum.size());
        theResultOfMapForum.entrySet().stream()
                .map(entry -> entry.getKey() + "---" + entry.getValue())
                .forEach(System.out::println);
    }
}

package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public final class Forum {

    private final List<ForumUser> theForumList= new ArrayList<>();



    public Forum(){


        theForumList.add(new ForumUser(1,"Tomek", 'M', LocalDate.of(1990,12,15),35));
        theForumList.add(new ForumUser(2,"Michal", 'M',LocalDate.of(2004,01,10),22));
        theForumList.add(new ForumUser(3,"Ola", 'K',LocalDate.of(1999,12,05),14));
        theForumList.add(new ForumUser(5,"Marcin", 'M',LocalDate.of(1950,04,10),50));
        theForumList.add(new ForumUser(4,"Kasia", 'K',LocalDate.of(2005,10,05),120));
        theForumList.add(new ForumUser(6,"Marta", 'K',LocalDate.of(1982,05,04),10));
    }
public List<ForumUser> getList() {
    return new ArrayList<>(theForumList);
}
}

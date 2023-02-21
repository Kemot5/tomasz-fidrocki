package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.LocalDateTime;

public final class ForumUser {
    private final int numberID;
    private final String nickName;
    private final char sex;
    private final LocalDate dateBirth;
    private final int quantityPost;

    public ForumUser(int numberID, String nickName, char sex, LocalDate dateBirth, int quantityPost) {
        this.numberID = numberID;
        this.nickName = nickName;
        this.sex = sex;
        this.dateBirth = dateBirth;
        this.quantityPost = quantityPost;
    }

    public int getNumberID() {
        return numberID;
    }

    public String getNickName() {
        return nickName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public int getQuantityPost() {
        return quantityPost;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "numberID=" + numberID +
                ", nickName='" + nickName + '\'' +
                ", sex=" + sex +
                ", dateBirth=" + dateBirth +
                ", quantityPost=" + quantityPost +
                '}';
    }
}

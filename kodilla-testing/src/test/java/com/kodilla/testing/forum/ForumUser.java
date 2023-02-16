package com.kodilla.testing.forum;

import com.sun.source.tree.IfTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ForumUser {
    private String name;
    private String realName;
    private List<ForumPost> post = new ArrayList<>();
    private List<ForumComment> comments = new LinkedList<>();


    public ForumUser(String name, String realName) {
        this.name = name;
        this.realName = realName;
    }

    public void addPost(String author, String PostBody){
        ForumPost thePost = new ForumPost(PostBody, author);
        post.add(thePost);
    }
    public void addComment(ForumPost thePost, String author, String commentBody ) {
        ForumComment theComment = new ForumComment(thePost, commentBody, author);
        comments.add(theComment);
    }
    public int getPostsQuantity(){
        return post.size();
    }
    public int getCommentsQuantity(){
        return comments.size();
    }

    public ForumPost getPost(int postNumber) {
        if(postNumber >=0 && postNumber < post.size()){
            return post.get(postNumber);
        }
        return null;
    }
    public ForumComment getComment(int commentNumber) {
        ForumComment theComment = null;
        if (commentNumber >= 0 && commentNumber < comments.size()) {
            theComment = comments.get(commentNumber);
        }
        return theComment;
    }
    public boolean removePost(ForumPost thePost) {
        boolean result = false;
        if (post.contains(thePost)) {
            post.remove(thePost);
            result = true;
        }
        return result;
    }
    public boolean removeComment(ForumComment theComment) {
        boolean result = false;
        if (comments.contains(theComment)) {
            comments.remove(theComment);
            result = true;
        }
        return result;
    }
    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }
}

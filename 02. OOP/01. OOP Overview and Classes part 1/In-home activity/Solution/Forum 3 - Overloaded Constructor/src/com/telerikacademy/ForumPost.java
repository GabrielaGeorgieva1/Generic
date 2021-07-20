package com.telerikacademy;

public class ForumPost {
    public String author;
    public String text;
    public int upVotes;

    public ForumPost(String author, String text) {
        this(author, text, 0);
    }

    public ForumPost(String author, String text, int upVotes) {
        this.author = author;
        this.text = text;
        this.upVotes = upVotes;
    }

}

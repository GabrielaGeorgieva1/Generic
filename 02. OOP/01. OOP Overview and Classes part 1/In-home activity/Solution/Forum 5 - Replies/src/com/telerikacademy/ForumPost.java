package com.telerikacademy;

import java.util.ArrayList;

public class ForumPost {
    public String author;
    public String text;
    public int upVotes;
    public ArrayList<String> replies;

    public ForumPost(String author, String text) {
        this(author, text, 0);
    }

    public ForumPost(String author, String text, int votes) {
        this.author = author;
        this.text = text;
        this.upVotes = votes;
        replies = new ArrayList<>();
    }

    public String format(){
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("%s / by %s, %d votes. %n", text, author, upVotes));
        for (String reply : replies) {
            builder.append(String.format("- %s", reply)).append(System.lineSeparator());
        }
        return builder.toString();
    }
}

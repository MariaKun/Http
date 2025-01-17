package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Post {
    private final Integer upvotes;
    private final String id;
    private final String text;
    private final String type;
    private final String user;

    public Post(@JsonProperty("upvotes") Integer upvotes,
                @JsonProperty("id") String id,
                @JsonProperty("text") String text,
                @JsonProperty("type") String type,
                @JsonProperty("user") String user) {
        this.upvotes = upvotes;
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public Integer getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return "Post" +
                "\n user=" + user +
                "\n id=" + id +
                "\n type=" + type +
                "\n text=" + text +
                "\n upvotes=" + upvotes;
    }
}

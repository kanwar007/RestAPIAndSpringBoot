package com.kanwartech.RestAPIAndSpringBoot.model;

public class Post {
    private Integer postId;
    private String postMessage;
    private Integer userId;

    

    public Post(Integer postId, String postMessage, Integer userId) {
        this.postId = postId;
        this.postMessage = postMessage;
        this.userId = userId;
    }

    public Integer getPostId() {
        return postId;
    }

    public String getPostMessage() {
        return postMessage;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public void setPostMessage(String postMessage) {
        this.postMessage = postMessage;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    
    
}

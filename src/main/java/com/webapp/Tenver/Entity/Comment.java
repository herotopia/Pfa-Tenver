package com.webapp.Tenver.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
public class Comment implements Serializable {
    @Id
    @GeneratedValue
    private long commentId;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn
    private User user;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn
    private Event commentedEvent;
    private String comment;
    private Timestamp commentDate;

    public Comment() {
        super();
    }

    public Comment(String comment, Timestamp commentDate) {
        this.comment = comment;
        this.commentDate = commentDate;
    }

    public long getCommentId() {
        return commentId;
    }

    public void setCommentId(long commentId) {
        this.commentId = commentId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Event getCommentedEvent() {
        return commentedEvent;
    }

    public void setCommentedEvent(Event commentedEvent) {
        this.commentedEvent = commentedEvent;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Timestamp getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Timestamp commentDate) {
        this.commentDate = commentDate;
    }

    public Comment(long commentId, User user, Event commentedEvent, String comment, Timestamp commentDate) {
        this.commentId = commentId;
        this.user = user;
        this.commentedEvent = commentedEvent;
        this.comment = comment;
        this.commentDate = commentDate;
    }
}

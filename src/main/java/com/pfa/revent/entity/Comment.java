package com.pfa.revent.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
@Entity
@Table(name="COMMENT")
public class Comment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long commentId;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "VIEWER_ID")
    private Viewer commentOwner;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "EVENT_ID")
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

    public Comment(long commentId, Viewer commentOwner, Event commentedEvent, String comment, Timestamp commentDate) {
        this.commentId = commentId;
        this.commentOwner = commentOwner;
        this.commentedEvent = commentedEvent;
        this.comment = comment;
        this.commentDate = commentDate;
    }

    public long getCommentId() {
        return commentId;
    }

    public void setCommentId(long commentId) {
        this.commentId = commentId;
    }

    public Viewer getCommentOwner() {
        return commentOwner;
    }

    public void setCommentOwner(Viewer commentOwner) {
        this.commentOwner = commentOwner;
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
}

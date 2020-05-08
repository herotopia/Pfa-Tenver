package com.pfa.revent.service;

import com.pfa.revent.entity.Comment;

import java.util.List;

public interface CommentServiceInterface {
    Comment save(Comment comment);
    Comment update(long commentId, Comment comment);
    void remove(long commentId, Comment comment);
    Comment getComment(long commentId);
    List<Comment> getAllComments();
}

package com.pfa.revent.service;

import com.pfa.revent.entity.Comment;
import com.pfa.revent.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommentService implements CommentServiceInterface{
    @Autowired
    private CommentRepository commentRepository;

    public Comment save(Comment comment)
    {
        return commentRepository.save(comment);
    }

    public Comment update(long commentId, Comment comment)
    {
        if(commentId!=comment.getCommentId())
            return null;
        return commentRepository.save(comment);
    }

    public void remove(long commentId, Comment comment)
    {
        if(commentId!=comment.getCommentId())
            return;
        commentRepository.delete(comment);
    }

    public Comment getComment(long commentId)
    {
        return commentRepository.findById(commentId).orElse(null);
    }

    // edited
    public List<Comment> getAllComments()

    {
        return new ArrayList<>(commentRepository.findAll());
    }
    /*
    public List<Utilisateur> getAllUtilisaters()

    {
        List<Comment> comments = new ArrayList<>();
        CommentRepository.findAll().forEach(comments::add);
        return comments;
    }*/
}

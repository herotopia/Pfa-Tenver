package com.pfa.revent.controller;

import com.pfa.revent.entity.Comment;
import com.pfa.revent.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class CommentController {
    @Autowired
    private CommentService commentService;

    @RequestMapping("/comment/{commentId}")
    public Comment getComment(@PathVariable long commentId)
    {
        return commentService.getComment(commentId);
    }

    @RequestMapping("/comments")
    public List<Comment> getAllComments()
    {
        return commentService.getAllComments();
    }


    @RequestMapping(method= RequestMethod.POST, value="/comment")
    public void addComment(@RequestBody Comment comment)
    {
        commentService.save(comment);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/Comment/{commentId}")
    public void updateComment(@RequestBody Comment comment, @PathVariable long commentId)
    {
        commentService.update(commentId, comment);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/comment/{commentId}")
    public void removeComment(@RequestBody Comment comment, @PathVariable long commentId)
    {
        commentService.remove(commentId, comment);
    }
}

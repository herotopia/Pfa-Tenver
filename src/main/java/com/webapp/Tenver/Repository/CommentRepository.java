package com.webapp.Tenver.Repository;

import com.webapp.Tenver.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}

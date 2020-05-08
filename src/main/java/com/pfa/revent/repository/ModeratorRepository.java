package com.pfa.revent.repository;

import com.pfa.revent.entity.Moderator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModeratorRepository extends JpaRepository<Moderator,Long> {
    Moderator findByModeratorId(long moderatorId);
    List<Moderator> getAllByModeratorId(long ModeratorId);
}

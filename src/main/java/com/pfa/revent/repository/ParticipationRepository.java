package com.pfa.revent.repository;

import com.pfa.revent.entity.Event;
import com.pfa.revent.entity.Participation;
import com.pfa.revent.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParticipationRepository extends JpaRepository<Participation,Long> {
    List<Participation> findParticipationByParticipatedEvent(Event participatedEvent);
    List<Participation> findParticipationByParticipant(User participant);
    List<Participation> findParticipationByParticipationType(String participationType);
}

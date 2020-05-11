package com.pfa.revent.repository;

import com.pfa.revent.entity.Event;
import com.pfa.revent.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event,Long> {
    List<Event> findByStartDateBetween(Date minDate, Date maxDate);
    List<Event> findByOrganizer(User organizer);

/*    //??
    List<Event> findByTag(Tag tag);*/

    List<Event> findByCity(String city);
    List<Event> findByEventTitleContaining(String infixTitle);
}

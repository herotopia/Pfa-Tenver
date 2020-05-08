package com.pfa.revent.service;

import com.pfa.revent.entity.Event;
import com.pfa.revent.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService implements EventServiceInterface{
    @Autowired
    private EventRepository eventRepository;

    public Event save(Event event)
    {
        return eventRepository.save(event);
    }

    public Event update(long eventId, Event event)
    {
        if(eventId!=event.getEventId())
            return null;
        return eventRepository.save(event);
    }

    public void remove(long eventId, Event event)
    {
        if(eventId!=event.getEventId())
            return;
        eventRepository.delete(event);
    }

    public Event getEvent(long eventId)
    {
        return eventRepository.findById(eventId).orElse(null);
    }

    // edited
    public List<Event> getAllEvents()

    {
        return new ArrayList<>(eventRepository.findAll());
    }
    /*
    public List<Utilisateur> getAllUtilisaters()

    {
        List<Event> events = new ArrayList<>();
        EventRepository.findAll().forEach(events::add);
        return events;
    }*/
}

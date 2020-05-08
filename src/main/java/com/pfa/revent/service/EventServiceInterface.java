package com.pfa.revent.service;

import com.pfa.revent.entity.Event;

import java.util.List;

public interface EventServiceInterface {
    Event save(Event event);
    Event update(long eventId, Event event);
    void remove(long eventId, Event event);
    Event getEvent(long eventId);
    List<Event> getAllEvents();
}

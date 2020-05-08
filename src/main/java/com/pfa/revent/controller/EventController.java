package com.pfa.revent.controller;

import com.pfa.revent.entity.Event;
import com.pfa.revent.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventController {
    @Autowired
    private EventService eventService;

    @RequestMapping("/event/{eventId}")
    public Event getEvent(@PathVariable long eventId)
    {
        return eventService.getEvent(eventId);
    }

    @RequestMapping("/events")
    public List<Event> getAllEvents()
    {
        return eventService.getAllEvents();
    }


    @RequestMapping(method= RequestMethod.POST, value="/event")
    public void addEvent(@RequestBody Event event)
    {
        eventService.save(event);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/Event/{eventId}")
    public void updateEvent(@RequestBody Event event, @PathVariable long eventId)
    {
        eventService.update(eventId, event);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/event/{eventId}")
    public void removeEvent(@RequestBody Event event, @PathVariable long eventId)
    {
        eventService.remove(eventId, event);
    }
}

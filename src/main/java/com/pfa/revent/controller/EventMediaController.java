package com.pfa.revent.controller;

import com.pfa.revent.entity.EventMedia;
import com.pfa.revent.service.EventMediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventMediaController {
    @Autowired
    private EventMediaService eventMediaService;

    @RequestMapping("/eventMedia/{eventMediaId}")
    public EventMedia getEventMedia(@PathVariable long eventMediaId)
    {
        return eventMediaService.getEventMedia(eventMediaId);
    }

    @RequestMapping("/eventMedias")
    public List<EventMedia> getAllEventMedias()
    {
        return eventMediaService.getAllEventMedias();
    }


    @RequestMapping(method= RequestMethod.POST, value="/eventMedia")
    public void addEventMedia(@RequestBody EventMedia eventMedia)
    {
        eventMediaService.save(eventMedia);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/EventMedia/{eventMediaId}")
    public void updateEventMedia(@RequestBody EventMedia eventMedia, @PathVariable long eventMediaId)
    {
        eventMediaService.update(eventMediaId, eventMedia);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/eventMedia/{eventMediaId}")
    public void removeEventMedia(@RequestBody EventMedia eventMedia, @PathVariable long eventMediaId)
    {
        eventMediaService.remove(eventMediaId, eventMedia);
    }
}

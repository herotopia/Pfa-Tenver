package com.pfa.revent.service;

import com.pfa.revent.entity.EventMedia;
import com.pfa.revent.repository.EventMediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventMediaService implements EventMediaServiceInterface{
    @Autowired
    EventMediaRepository eventMediaRepository;

    public EventMedia save(EventMedia eventMedia)
    {
        return eventMediaRepository.save(eventMedia);
    }

    public EventMedia update(long eventMediaId, EventMedia eventMedia)
    {
        if(eventMediaId!=eventMedia.getEventMediaId())
            return null;
        return eventMediaRepository.save(eventMedia);
    }

    public void remove(long eventMediaId, EventMedia eventMedia)
    {
        if(eventMediaId!=eventMedia.getEventMediaId())
            return;
        eventMediaRepository.delete(eventMedia);
    }

    public EventMedia getEventMedia(long eventMediaId)
    {
        return eventMediaRepository.findById(eventMediaId).orElse(null);
    }

    // edited
    public List<EventMedia> getAllEventMedias()

    {
        return new ArrayList<>(eventMediaRepository.findAll());
    }
    /*
    public List<Utilisateur> getAllUtilisaters()

    {
        List<EventMedia> eventMedias = new ArrayList<>();
        EventMediaRepository.findAll().forEach(eventMedias::add);
        return eventMedias;
    }*/
}

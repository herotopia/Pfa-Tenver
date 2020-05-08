package com.pfa.revent.service;

import com.pfa.revent.entity.EventMedia;

import java.util.List;

public interface EventMediaServiceInterface {
    EventMedia save(EventMedia eventMedia);
    EventMedia update(long eventMediaId, EventMedia eventMedia);
    void remove(long eventMediaId, EventMedia eventMedia);
    EventMedia getEventMedia(long eventMediaId);
    List<EventMedia> getAllEventMedias();
}

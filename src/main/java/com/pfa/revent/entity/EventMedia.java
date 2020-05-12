package com.pfa.revent.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="EVENT_MEDIA")
public class EventMedia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long eventMediaId;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn
    private Event mediatedEvent;

    private String Description;
    private byte[] eventMedia;

    public EventMedia() {
        super();
    }

    public EventMedia(byte[] eventMedia, String description) {
        this.eventMedia = eventMedia;
        Description = description;
    }

    public EventMedia(long eventMediaId, Event mediatedEvent, byte[] eventMedia, String description) {
        this.eventMediaId = eventMediaId;
        this.mediatedEvent = mediatedEvent;
        this.eventMedia = eventMedia;
        Description = description;
    }

    public long getEventMediaId() {
        return eventMediaId;
    }

    public void setEventMediaId(long eventMediaId) {
        this.eventMediaId = eventMediaId;
    }

    public Event getMediatedEvent() {
        return mediatedEvent;
    }

    public void setMediatedEvent(Event mediatedEvent) {
        this.mediatedEvent = mediatedEvent;
    }

    public byte[] getEventMedia() {
        return eventMedia;
    }

    public void setEventMedia(byte[] eventMedia) {
        this.eventMedia = eventMedia;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}

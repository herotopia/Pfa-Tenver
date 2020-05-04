package com.webapp.Tenver.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class EventMedia implements Serializable {
    @Id
    @GeneratedValue
    private long eventMediaId;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn
    private Event mediatedEvent;
    private byte[] eventMedia;

    public EventMedia() {
        super();
    }

    public EventMedia(byte[] eventMedia) {
        this.eventMedia = eventMedia;
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

    public EventMedia(long eventMediaId, Event mediatedEvent, byte[] eventMedia) {
        this.eventMediaId = eventMediaId;
        this.mediatedEvent = mediatedEvent;
        this.eventMedia = eventMedia;
    }
}

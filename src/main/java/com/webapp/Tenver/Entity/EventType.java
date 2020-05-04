package com.webapp.Tenver.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class EventType implements Serializable {
    @Id
    @GeneratedValue
    private long eventTypeId;
    private String eventType;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Collection<Event> events;

    public EventType() {
        super();
    }

    public EventType(String eventType) {
        this.eventType = eventType;
    }

    public long getEventTypeId() {
        return eventTypeId;
    }

    public void setEventTypeId(long eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Collection<Event> getEvents() {
        return events;
    }

    public void setEvents(Collection<Event> events) {
        this.events = events;
    }

    public EventType(long eventTypeId, String eventType, Collection<Event> events) {
        this.eventTypeId = eventTypeId;
        this.eventType = eventType;
        this.events = events;
    }
}

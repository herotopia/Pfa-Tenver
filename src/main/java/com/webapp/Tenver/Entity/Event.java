package com.webapp.Tenver.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;

@Entity
public class Event implements Serializable {
    @Id
    @GeneratedValue
    private long eventId;
    @ManyToOne(cascade =CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn
    private User organizer;
    @ManyToOne(cascade =CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn
    private EventType eventType;
    @ManyToOne(cascade =CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn
    private EventAddress eventAddress;
    private String eventTitle;
    private Date startDate;
    private Date endDate;
    private String decription;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "mediatedEvent",fetch = FetchType.LAZY)
    private Collection<EventMedia> eventMediaCollection;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "taggedEvent",fetch = FetchType.LAZY)
    private Collection<EventTag> eventTags;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "participatedEvent",fetch = FetchType.LAZY)
    private Collection<Participation> participations;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "commentedEvent",fetch = FetchType.LAZY)
    private Collection<Comment> comments;

    public Event() {
        super();
    }

    public Event(String eventTitle, Date startDate, Date endDate, String decription) {
        this.eventTitle = eventTitle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.decription = decription;
    }

    public long getEventId() {
        return eventId;
    }

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }

    public User getOrganizer() {
        return organizer;
    }

    public void setOrganizer(User organizer) {
        this.organizer = organizer;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public EventAddress getEventAddress() {
        return eventAddress;
    }

    public void setEventAddress(EventAddress eventAddress) {
        this.eventAddress = eventAddress;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public Collection<EventMedia> getEventMediaCollection() {
        return eventMediaCollection;
    }

    public void setEventMediaCollection(Collection<EventMedia> eventMediaCollection) {
        this.eventMediaCollection = eventMediaCollection;
    }

    public Collection<EventTag> getEventTags() {
        return eventTags;
    }

    public void setEventTags(Collection<EventTag> eventTags) {
        this.eventTags = eventTags;
    }

    public Collection<Participation> getParticipations() {
        return participations;
    }

    public void setParticipations(Collection<Participation> participations) {
        this.participations = participations;
    }

    public Collection<Comment> getComments() {
        return comments;
    }

    public void setComments(Collection<Comment> comments) {
        this.comments = comments;
    }

    public Event(long eventId, User organizer, EventType eventType,
                 EventAddress eventAddress, String eventTitle,
                 Date startDate, Date endDate, String decription,
                 Collection<EventMedia> eventMediaCollection,
                 Collection<EventTag> eventTags,
                 Collection<Participation> participations,
                 Collection<Comment> comments) {
        this.eventId = eventId;
        this.organizer = organizer;
        this.eventType = eventType;
        this.eventAddress = eventAddress;
        this.eventTitle = eventTitle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.decription = decription;
        this.eventMediaCollection = eventMediaCollection;
        this.eventTags = eventTags;
        this.participations = participations;
        this.comments = comments;
    }
}

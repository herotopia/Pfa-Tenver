package com.pfa.revent.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name="EVENT")
public class Event implements Serializable {
    @Id
    @GeneratedValue
    private long eventId;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGANIZER_ID")
    private Editor organizer;
    private String eventTitle;
    private String eventType;
    private Date startDate;
    private Date endDate;
    private String city;
    private String region;
    private int zipCode;
    private String street;
    private String otherInformation;
    private String description;
    private String status;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "mediatedEvent",fetch = FetchType.LAZY)
    private Collection<EventMedia> eventMediaCollection;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "participatedEvent",fetch = FetchType.LAZY)
    private Collection<Participation> participations;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "commentedEvent",fetch = FetchType.LAZY)
    private Collection<Comment> comments;
    @ManyToMany(targetEntity = Tag.class, cascade = { CascadeType.ALL })
    @JoinTable(name = "EVENT_TAG",
            joinColumns = { @JoinColumn(name = "EVENT_ID") },
            inverseJoinColumns = { @JoinColumn(name = "TAG_ID") })
    private Collection<Tag> tags;

    public Event() {
        super();
    }

    public Event(String eventTitle, String eventType, Date startDate, Date endDate, String city, String region, int zipCode, String street, String otherInformation, String description, String status) {
        this.eventTitle = eventTitle;
        this.eventType = eventType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.city = city;
        this.region = region;
        this.zipCode = zipCode;
        this.street = street;
        this.otherInformation = otherInformation;
        this.description = description;
        this.status = status;
    }

    public Event(long eventId, Editor organizer, String eventTitle, String eventType, Date startDate, Date endDate, String city, String region, int zipCode, String street, String otherInformation, String description, String status) {
        this.eventId = eventId;
        this.organizer = organizer;
        this.eventTitle = eventTitle;
        this.eventType = eventType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.city = city;
        this.region = region;
        this.zipCode = zipCode;
        this.street = street;
        this.otherInformation = otherInformation;
        this.description = description;
        this.status = status;
    }

    public Event(long eventId, Editor organizer, String eventTitle, String eventType, Date startDate, Date endDate, String city, String region, int zipCode, String street, String otherInformation, String description, String status, Collection<EventMedia> eventMediaCollection, Collection<Participation> participations, Collection<Comment> comments, Collection<Tag> tags) {
        this.eventId = eventId;
        this.organizer = organizer;
        this.eventTitle = eventTitle;
        this.eventType = eventType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.city = city;
        this.region = region;
        this.zipCode = zipCode;
        this.street = street;
        this.otherInformation = otherInformation;
        this.description = description;
        this.status = status;
        this.eventMediaCollection = eventMediaCollection;
        this.participations = participations;
        this.comments = comments;
        this.tags = tags;
    }

    public long getEventId() {
        return eventId;
    }

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }

    public Editor getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Editor organizer) {
        this.organizer = organizer;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getOtherInformation() {
        return otherInformation;
    }

    public void setOtherInformation(String otherInformation) {
        this.otherInformation = otherInformation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Collection<EventMedia> getEventMediaCollection() {
        return eventMediaCollection;
    }

    public void setEventMediaCollection(Collection<EventMedia> eventMediaCollection) {
        this.eventMediaCollection = eventMediaCollection;
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

    public Collection<Tag> getTags() {
        return tags;
    }

    public void setTags(Collection<Tag> tags) {
        this.tags = tags;
    }
}

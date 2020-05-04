package com.webapp.Tenver.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
@Entity
public class Participation implements Serializable {
    @Id
    @GeneratedValue
    private long participationId;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn
    private User participant;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn
    private Event participatedEvent;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn
    private ParticipationType participationType;

    public Participation() {
        super();
    }

    public long getParticipationId() {
        return participationId;
    }

    public void setParticipationId(long participationId) {
        this.participationId = participationId;
    }

    public User getParticipant() {
        return participant;
    }

    public void setParticipant(User participant) {
        this.participant = participant;
    }

    public Event getParticipatedEvent() {
        return participatedEvent;
    }

    public void setParticipatedEvent(Event participatedEvent) {
        this.participatedEvent = participatedEvent;
    }

    public ParticipationType getParticipationType() {
        return participationType;
    }

    public void setParticipationType(ParticipationType participationType) {
        this.participationType = participationType;
    }

    public Participation(long participationId, User participant, Event participatedEvent, ParticipationType participationType) {
        this.participationId = participationId;
        this.participant = participant;
        this.participatedEvent = participatedEvent;
        this.participationType = participationType;
    }
}

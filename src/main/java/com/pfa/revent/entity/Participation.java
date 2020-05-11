package com.pfa.revent.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="PARTICIPATION")
public class Participation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long participationId;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "VIEWER_ID")
    private Viewer participant;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "EVENT_ID")
    private Event participatedEvent;
    private String participationType;

    public Participation() {
        super();
    }

    public Participation(String participationType) {
        this.participationType = participationType;
    }

    public Participation(Viewer participant, Event participatedEvent, String participationType) {
        this.participant = participant;
        this.participatedEvent = participatedEvent;
        this.participationType = participationType;
    }

    public Participation(long participationId, Viewer participant, Event participatedEvent, String participationType) {
        this.participationId = participationId;
        this.participant = participant;
        this.participatedEvent = participatedEvent;
        this.participationType = participationType;
    }

    public long getParticipationId() {
        return participationId;
    }

    public void setParticipationId(long participationId) {
        this.participationId = participationId;
    }

    public Viewer getParticipant() {
        return participant;
    }

    public void setParticipant(Viewer participant) {
        this.participant = participant;
    }

    public Event getParticipatedEvent() {
        return participatedEvent;
    }

    public void setParticipatedEvent(Event participatedEvent) {
        this.participatedEvent = participatedEvent;
    }

    public String getParticipationType() {
        return participationType;
    }

    public void setParticipationType(String participationType) {
        this.participationType = participationType;
    }
}

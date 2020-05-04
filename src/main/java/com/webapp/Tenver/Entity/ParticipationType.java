package com.webapp.Tenver.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class ParticipationType implements Serializable {
    @Id
    @GeneratedValue
    long participationTypeId;
    private String participationType;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "participationType",fetch = FetchType.LAZY)
    private Collection<Participation> participations;

    public ParticipationType() {
        super();
    }

    public long getParticipationTypeId() {
        return participationTypeId;
    }

    public void setParticipationTypeId(long participationTypeId) {
        this.participationTypeId = participationTypeId;
    }

    public String getParticipationType() {
        return participationType;
    }

    public void setParticipationType(String participationType) {
        this.participationType = participationType;
    }

    public Collection<Participation> getParticipations() {
        return participations;
    }

    public void setParticipations(Collection<Participation> participations) {
        this.participations = participations;
    }

    public ParticipationType(long participationTypeId, String participationType, Collection<Participation> participations) {
        this.participationTypeId = participationTypeId;
        this.participationType = participationType;
        this.participations = participations;
    }
}

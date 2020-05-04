package com.webapp.Tenver.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class Moderator implements Serializable {
    @Id
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private User moderatorId;
    private int maxEditorsNumber;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "parentModerator",fetch = FetchType.LAZY)
    private Collection<Editor> editors;

    public Moderator() {
        super();
    }

    public Moderator(int maxEditorsNumber) {
        this.maxEditorsNumber = maxEditorsNumber;
    }

    public User getModeratorId() {
        return moderatorId;
    }

    public void setModeratorId(User moderatorId) {
        this.moderatorId = moderatorId;
    }

    public int getMaxEditorsNumber() {
        return maxEditorsNumber;
    }

    public void setMaxEditorsNumber(int maxEditorsNumber) {
        this.maxEditorsNumber = maxEditorsNumber;
    }

    public Collection<Editor> getEditors() {
        return editors;
    }

    public void setEditors(Collection<Editor> editors) {
        this.editors = editors;
    }

    public Moderator(User moderatorId, int maxEditorsNumber, Collection<Editor> editors) {
        this.moderatorId = moderatorId;
        this.maxEditorsNumber = maxEditorsNumber;
        this.editors = editors;
    }
}

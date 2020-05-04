package com.webapp.Tenver.Entity;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Editor implements Serializable {
    @Id
    @OneToOne(cascade =CascadeType.ALL,fetch = FetchType.LAZY)
    private User editorId;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Moderator parentModerator;

    public Editor() {
        super();
    }

    public User getEditorId() {
        return editorId;
    }

    public void setEditorId(User editorId) {
        this.editorId = editorId;
    }

    public Moderator getParentModerator() {
        return parentModerator;
    }

    public void setParentModerator(Moderator parentModerator) {
        this.parentModerator = parentModerator;
    }

    public Editor(User editorId, Moderator parentModerator) {
        this.editorId = editorId;
        this.parentModerator = parentModerator;
    }
}

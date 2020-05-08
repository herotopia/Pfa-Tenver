package com.pfa.revent.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
/*@Table(name="U_EDITOR")
@PrimaryKeyJoinColumn(name="U_ID")*/
public class Editor /*extends User*/ implements Serializable {
        @Id
    @Column(name = "EDITOR_ID")
    private long editorId;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Moderator parentModerator;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "organizer")
    private Collection<Event> events;

    public Editor() {
        super();
    }

/*    public Editor(String firstName, String lastName, String username, String password, String passwordConfirm, String email, int phoneNumber, Date birthdate, Timestamp registrationDate, byte[] avatarImage, Collection<Event> events) {
        super(firstName, lastName, username, password, passwordConfirm, email, phoneNumber, birthdate, registrationDate, avatarImage);
        this.events = events;
    }*/

/*    public Editor(long userId, String firstName, String lastName, String username, String password, String passwordConfirm, String email, int phoneNumber, Date birthdate, Timestamp registrationDate, byte[] avatarImage, Moderator parentModerator, Collection<Event> events) {
        super(userId, firstName, lastName, username, password, passwordConfirm, email, phoneNumber, birthdate, registrationDate, avatarImage);
        this.editorId = userId;
        this.parentModerator = parentModerator;
        this.events = events;
    }*/

    public Editor(long editorId, Moderator parentModerator, Collection<Event> events) {
        this.editorId = editorId;
        this.parentModerator = parentModerator;
        this.events = events;
    }

    //practical Constructor "Granting Editor to User"
    public Editor(User user, Moderator parentModerator){
        this.editorId = user.getUserId();
        this.parentModerator = parentModerator;
    }

    public long getEditorId() {
        return editorId;
    }

    public void setEditorId(long editorId) {
        this.editorId = editorId;
    }

    public Moderator getParentModerator() {
        return parentModerator;
    }

    public void setParentModerator(Moderator parentModerator) {
        this.parentModerator = parentModerator;
    }

    public Collection<Event> getEvents() {
        return events;
    }

    public void setEvents(Collection<Event> events) {
        this.events = events;
    }
}

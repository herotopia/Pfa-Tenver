package com.pfa.revent.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
/*@Table(name="U_MODERATOR")
@PrimaryKeyJoinColumn(name="U_ID")*/
public class Moderator /*extends User*/ implements Serializable {
    @Id
    @Column(name = "MODERATOR_ID")
    private long moderatorId;
    private int maxEditors;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "parentModerator",fetch = FetchType.LAZY)
    private Collection<Editor> editors;

    public Moderator() {
        super();
    }

    public Moderator(Collection<Editor> editors) {
        this.editors = editors;
    }

/*    public Moderator(String firstName, String lastName, String username, String password, String passwordConfirm, String email, int phoneNumber, Date birthdate, Timestamp registrationDate, byte[] avatarImage, Collection<Editor> editors) {
        super(firstName, lastName, username, password, passwordConfirm, email, phoneNumber, birthdate, registrationDate, avatarImage);
        this.editors = editors;
    }*/

/*    public Moderator(long userId, String firstName, String lastName, String username, String password, String passwordConfirm, String email, int phoneNumber, Date birthdate, Timestamp registrationDate, byte[] avatarImage, Collection<Editor> editors) {
        super(userId, firstName, lastName, username, password, passwordConfirm, email, phoneNumber, birthdate, registrationDate, avatarImage);
        this.moderatorId = userId;
        this.editors = editors;
    }*/

    public Moderator(long moderatorId, int maxEditors, Collection<Editor> editors) {
        this.moderatorId = moderatorId;
        this.maxEditors = maxEditors;
        this.editors = editors;
    }

    public int getMaxEditors() {
        return maxEditors;
    }

    public void setMaxEditors(int maxEditors) {
        this.maxEditors = maxEditors;
    }

    public long getModeratorId() {
        return moderatorId;
    }

    public void setModeratorId(long moderatorId) {
        this.moderatorId = moderatorId;
    }

    public Collection<Editor> getEditors() {
        return editors;
    }

    public void setEditors(Collection<Editor> editors) {
        this.editors = editors;
    }
}

package com.pfa.revent.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
/*@Table(name="U_VIEWER")
@PrimaryKeyJoinColumn(name="U_ID")*/
public class Viewer /*extends User*/ implements Serializable {
    @Id
    @Column(name = "VIEWER_ID")
    private long viewerId;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "commentOwner")
    private Collection<Comment> comments;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "participant")
    private Collection<Participation> participations;

    public Viewer() {
        super();
    }

/*    public Viewer(long userId, String firstName, String lastName, String username, String password, String passwordConfirm, String email, int phoneNumber, Date birthdate, Timestamp registrationDate, byte[] avatarImage) {
        super(userId, firstName, lastName, username, password, passwordConfirm, email, phoneNumber, birthdate, registrationDate, avatarImage);
    }*/

/*    public Viewer(long userId, String firstName, String lastName, String username, String password, String passwordConfirm, String email, int phoneNumber, Date birthdate, Timestamp registrationDate, byte[] avatarImage, Collection<Comment> comments, Collection<Participation> participations) {
        super(userId, firstName, lastName, username, password, passwordConfirm, email, phoneNumber, birthdate, registrationDate, avatarImage);
        this.viewerId = userId;
        this.comments = comments;
        this.participations = participations;
    }*/

    public Viewer(long viewerId, Collection<Comment> comments, Collection<Participation> participations) {
        this.viewerId = viewerId;
        this.comments = comments;
        this.participations = participations;
    }

    public Viewer(User user){
        this.viewerId = user.getUserId();
    }

    public long getViewerId() {
        return viewerId;
    }

    public void setViewerId(long viewerId) {
        this.viewerId = viewerId;
    }

    public Collection<Comment> getComments() {
        return comments;
    }

    public void setComments(Collection<Comment> comments) {
        this.comments = comments;
    }

    public Collection<Participation> getParticipations() {
        return participations;
    }

    public void setParticipations(Collection<Participation> participations) {
        this.participations = participations;
    }
}

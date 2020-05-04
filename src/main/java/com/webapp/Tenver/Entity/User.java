package com.webapp.Tenver.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(
        name = "Users",
        uniqueConstraints = @UniqueConstraint(columnNames = {"email","username"})
)
public class User implements Serializable {//viewer

    @Id
    @GeneratedValue
    private long userId;
    private String firstName;
    private String lastName;
    private String username;
    //pattern
    private String password;
    @Transient
    private String passwordConfirm;
    //pattern
    private String email;

    private int phoneNumber;

    private Date birthdate;
    private Timestamp registrationDate;

    private byte[] avatarImage;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "editorId")
    private Editor editor;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "moderatorId")
    private Moderator moderator;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "user")
    private Collection<Comment> comments;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "participant")
    private Collection<Participation> participations;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "organizer")
    private Collection<Event> events;


    public User() {
        super();
    }

    public User(String firstName, String lastName, String username,
                String password, String email, int phoneNumber,
                Date birthdate, Timestamp registrationDate, byte[] avatarImage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.birthdate = birthdate;
        this.registrationDate = registrationDate;
        this.avatarImage = avatarImage;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Timestamp getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Timestamp registrationDate) {
        this.registrationDate = registrationDate;
    }

    public byte[] getAvatarImage() {
        return avatarImage;
    }

    public void setAvatarImage(byte[] avatarImage) {
        this.avatarImage = avatarImage;
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

    public Collection<Event> getEvents() {
        return events;
    }

    public void setEvents(Collection<Event> events) {
        this.events = events;
    }

    public User(long userId, String firstName, String lastName,
                String username, String password, String passwordConfirm,
                String email, int phoneNumber, Date birthdate,
                Timestamp registrationDate, byte[] avatarImage, Editor editor,
                Moderator moderator, Collection<Comment> comments,
                Collection<Participation> participations, Collection<Event> events) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.passwordConfirm = passwordConfirm;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.birthdate = birthdate;
        this.registrationDate = registrationDate;
        this.avatarImage = avatarImage;
        this.editor = editor;
        this.moderator = moderator;
        this.comments = comments;
        this.participations = participations;
        this.events = events;
    }
}

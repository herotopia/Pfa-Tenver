package com.pfa.revent.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USER_ID")
    private long userId;
    private String firstName;
    private String lastName;
    //pattern
    private String password;
    @Transient
    private String passwordConfirm;
    @Email
    @Column(unique = true)
    private String email;

    private Date birthdate;
    @CreationTimestamp
    private Timestamp registrationDate;

    private byte[] avatarImage;

    //Spring security//////////////////////////////////
    @Column(unique = true)
    private String username;
    private String userAccessPrivilege;
    private static boolean active = true;
    private String roles;
    ///////////////////////////////////////////////////

    public User() {
        super();
    }

    //Global constructor
    public User(long userId, String firstName, String lastName, String password, String passwordConfirm, String email, Date birthdate, Timestamp registrationDate, byte[] avatarImage, String username, String userAccessPrivilege, boolean active, String roles) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.passwordConfirm = passwordConfirm;
        this.email = email;
        this.birthdate = birthdate;
        this.registrationDate = registrationDate;
        this.avatarImage = avatarImage;
        this.username = username;
        this.userAccessPrivilege = userAccessPrivilege;
        this.active = active;
        this.roles = roles;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserAccessPrivilege() {
        return userAccessPrivilege;
    }

    public void setUserAccessPrivilege(String userAccessPrivilege) {
        this.userAccessPrivilege = userAccessPrivilege;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
}

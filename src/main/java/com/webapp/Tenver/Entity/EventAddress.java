package com.webapp.Tenver.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class EventAddress implements Serializable {
    @Id
    @GeneratedValue
    private long addressId;
    private String city;
    private String region;
    private int zipCode;
    private String street;
    private String otherInformation;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "eventAddress",fetch = FetchType.LAZY)
    private Collection<Event> events;

    public EventAddress() {
        super();
    }

    public EventAddress(String city, String region, int zipCode, String street, String otherInformation) {
        this.city = city;
        this.region = region;
        this.zipCode = zipCode;
        this.street = street;
        this.otherInformation = otherInformation;
    }

    public Collection<Event> getEvents() {
        return events;
    }

    public void setEvents(Collection<Event> events) {
        this.events = events;
    }

    public long getAddressId() {
        return addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getOtherInformation() {
        return otherInformation;
    }

    public void setOtherInformation(String otherInformation) {
        this.otherInformation = otherInformation;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public EventAddress(long addressId, String city, String region, int zipCode, String street, String otherInformation, Collection<Event> events) {
        this.addressId = addressId;
        this.city = city;
        this.region = region;
        this.zipCode = zipCode;
        this.street = street;
        this.otherInformation = otherInformation;
        this.events = events;
    }
}

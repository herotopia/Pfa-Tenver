package com.webapp.Tenver.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class Tag implements Serializable {
    @Id
    @GeneratedValue
    private long TagId;
    private String Tag;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "usedTag",fetch = FetchType.LAZY)
    private Collection<EventTag> eventTags;

    public Tag() {
        super();
    }

    public Tag(String tag) {
        Tag = tag;
    }

    public long getTagId() {
        return TagId;
    }

    public void setTagId(long tagId) {
        TagId = tagId;
    }

    public String getTag() {
        return Tag;
    }

    public void setTag(String tag) {
        Tag = tag;
    }

    public Collection<EventTag> getEventTags() {
        return eventTags;
    }

    public void setEventTags(Collection<EventTag> eventTags) {
        this.eventTags = eventTags;
    }

    public Tag(long tagId, String tag, Collection<EventTag> eventTags) {
        TagId = tagId;
        Tag = tag;
        this.eventTags = eventTags;
    }
}

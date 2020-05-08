package com.pfa.revent.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="TAG")
public class Tag implements Serializable {
    @Id
    @GeneratedValue
    private long tagId;
    private String tag;

    public Tag() {
        super();
    }

    public Tag(long tagId, String tag) {
        this.tagId = tagId;
        this.tag = tag;
    }

    public long getTagId() {
        return tagId;
    }

    public void setTagId(long tagId) {
        this.tagId = tagId;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}

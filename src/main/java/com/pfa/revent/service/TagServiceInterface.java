package com.pfa.revent.service;

import com.pfa.revent.entity.Tag;

import java.util.List;

public interface TagServiceInterface {
    Tag save(Tag tag);
    Tag update(long tagId, Tag tag);
    void remove(long tagId, Tag tag);
    Tag getTag(long tagId);
    List<Tag> getAllTags();
}

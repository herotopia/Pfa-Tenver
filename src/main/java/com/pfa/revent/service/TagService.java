package com.pfa.revent.service;

import com.pfa.revent.entity.Tag;
import com.pfa.revent.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TagService implements TagServiceInterface{
    @Autowired
    TagRepository tagRepository;

    public Tag save(Tag tag)
    {
        return tagRepository.save(tag);
    }

    public Tag update(long tagId, Tag tag)
    {
        if(tagId!=tag.getTagId())
            return null;
        return tagRepository.save(tag);
    }

    public void remove(long tagId, Tag tag)
    {
        if(tagId!=tag.getTagId())
            return;
        tagRepository.delete(tag);
    }

    public Tag getTag(long tagId)
    {
        return tagRepository.findById(tagId).orElse(null);
    }

    // edited
    public List<Tag> getAllTags()

    {
        return new ArrayList<>(tagRepository.findAll());
    }
    /*
    public List<Tag> getAllTags()

    {
        List<Tag> tags = new ArrayList<>();
        TagRepository.findAll().forEach(tags::add);
        return tags;
    }*/
}

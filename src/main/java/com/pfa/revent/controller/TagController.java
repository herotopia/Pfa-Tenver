package com.pfa.revent.controller;

import com.pfa.revent.entity.Tag;
import com.pfa.revent.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TagController {
    @Autowired
    private TagService tagService;

    @RequestMapping("/tag/{tagId}")
    public Tag getTag(@PathVariable long tagId)
    {
        return tagService.getTag(tagId);
    }

    @RequestMapping("/tags")
    public List<Tag> getAllTags()
    {
        return tagService.getAllTags();
    }


    @RequestMapping(method= RequestMethod.POST, value="/tag")
    public void addTag(@RequestBody Tag tag)
    {
        tagService.save(tag);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/Tag/{tagId}")
    public void updateTag(@RequestBody Tag tag, @PathVariable long tagId)
    {
        tagService.update(tagId, tag);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/tag/{tagId}")
    public void removeTag(@RequestBody Tag tag, @PathVariable long tagId)
    {
        tagService.remove(tagId, tag);
    }
}

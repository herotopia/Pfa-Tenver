package com.pfa.revent.controller;

import com.pfa.revent.entity.Moderator;
import com.pfa.revent.service.ModeratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ModeratorController {
    @Autowired
    private ModeratorService moderatorService;

    @RequestMapping("/moderator/{moderatorId}")
    public Moderator getModerator(@PathVariable long moderatorId)
    {
        return moderatorService.getModerator(moderatorId);
    }

    @RequestMapping("/moderators")
    public List<Moderator> getAllModerators()
    {
        return moderatorService.getAllModerators();
    }


    @RequestMapping(method= RequestMethod.POST, value="/moderator")
    public void addModerator(@RequestBody Moderator moderator)
    {
        moderatorService.save(moderator);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/Moderator/{moderatorId}")
    public void updateModerator(@RequestBody Moderator moderator, @PathVariable long moderatorId)
    {
        moderatorService.update(moderatorId, moderator);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/moderator/{moderatorId}")
    public void removeModerator(@RequestBody Moderator moderator, @PathVariable long moderatorId)
    {
        moderatorService.remove(moderatorId, moderator);
    }
}

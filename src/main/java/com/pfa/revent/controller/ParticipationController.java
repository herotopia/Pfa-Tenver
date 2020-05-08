package com.pfa.revent.controller;

import com.pfa.revent.entity.Participation;
import com.pfa.revent.service.ParticipationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ParticipationController {
    @Autowired
    private ParticipationService participationService;

    @RequestMapping("/participation/{participationId}")
    public Participation getParticipation(@PathVariable long participationId)
    {
        return participationService.getParticipation(participationId);
    }

    @RequestMapping("/participations")
    public List<Participation> getAllParticipations()
    {
        return participationService.getAllParticipations();
    }


    @RequestMapping(method= RequestMethod.POST, value="/participation")
    public void addParticipation(@RequestBody Participation participation)
    {
        participationService.save(participation);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/Participation/{participationId}")
    public void updateParticipation(@RequestBody Participation participation, @PathVariable long participationId)
    {
        participationService.update(participationId, participation);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/participation/{participationId}")
    public void removeParticipation(@RequestBody Participation participation, @PathVariable long participationId)
    {
        participationService.remove(participationId, participation);
    }
}

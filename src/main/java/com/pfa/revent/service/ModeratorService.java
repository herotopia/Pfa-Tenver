package com.pfa.revent.service;

import com.pfa.revent.entity.Moderator;
import com.pfa.revent.repository.ModeratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ModeratorService implements ModeratorServiceInterface{
    @Autowired
    private ModeratorRepository moderatorRepository;

    public Moderator save(Moderator moderator)
    {
        return moderatorRepository.save(moderator);
    }

    public Moderator update(long moderatorId, Moderator moderator)
    {
        if(moderatorId!=moderator.getModeratorId())
            return null;
        return moderatorRepository.save(moderator);
    }

    public void remove(long moderatorId, Moderator moderator)
    {
        if(moderatorId!=moderator.getModeratorId())
            return;
        moderatorRepository.delete(moderator);
    }

    public Moderator getModerator(long moderatorId)
    {
        return moderatorRepository.findById(moderatorId).orElse(null);
    }

    // edited
    public List<Moderator> getAllModerators()

    {
        return new ArrayList<>(moderatorRepository.findAll());
    }
    /*
    public List<Utilisateur> getAllUtilisaters()

    {
        List<Moderator> moderators = new ArrayList<>();
        ModeratorRepository.findAll().forEach(moderators::add);
        return moderators;
    }*/
}

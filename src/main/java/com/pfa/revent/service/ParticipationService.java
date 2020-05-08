package com.pfa.revent.service;

import com.pfa.revent.entity.Participation;
import com.pfa.revent.repository.ParticipationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ParticipationService implements ParticipationServiceInterface{
    @Autowired
    private ParticipationRepository participationRepository;

    public Participation save(Participation participation)
    {
        return participationRepository.save(participation);
    }

    public Participation update(long participationId, Participation participation)
    {
        if(participationId!=participation.getParticipationId())
            return null;
        return participationRepository.save(participation);
    }

    public void remove(long participationId, Participation participation)
    {
        if(participationId!=participation.getParticipationId())
            return;
        participationRepository.delete(participation);
    }

    public Participation getParticipation(long participationId)
    {
        return participationRepository.findById(participationId).orElse(null);
    }

    // edited
    public List<Participation> getAllParticipations()

    {
        return new ArrayList<>(participationRepository.findAll());
    }
    /*
    public List<Utilisateur> getAllUtilisaters()

    {
        List<Participation> participations = new ArrayList<>();
        ParticipationRepository.findAll().forEach(participations::add);
        return participations;
    }*/
}

package com.pfa.revent.service;

import com.pfa.revent.entity.Participation;

import java.util.List;

public interface ParticipationServiceInterface {
    Participation save(Participation participation);
    Participation update(long participationId, Participation participation);
    void remove(long participationId, Participation participation);
    Participation getParticipation(long participationId);
    List<Participation> getAllParticipations();
}

package com.pfa.revent.service;

import com.pfa.revent.entity.Moderator;

import java.util.List;

public interface ModeratorServiceInterface {
    Moderator save(Moderator moderator);
    Moderator update(long moderatorId, Moderator moderator);
    void remove(long moderatorId, Moderator moderator);
    Moderator getModerator(long moderatorId);
    List<Moderator> getAllModerators();
}

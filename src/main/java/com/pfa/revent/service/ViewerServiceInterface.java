package com.pfa.revent.service;

import com.pfa.revent.entity.Viewer;

import java.util.List;

public interface ViewerServiceInterface {
    Viewer save(Viewer viewer);
    Viewer update(long viewerId, Viewer viewer);
    void remove(long viewerId, Viewer viewer);
    Viewer getViewer(long viewerId);
    List<Viewer> getAllViewers();
}

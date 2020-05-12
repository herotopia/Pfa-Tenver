package com.pfa.revent.service;

import com.pfa.revent.entity.Viewer;
import com.pfa.revent.repository.ViewerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ViewerService implements ViewerServiceInterface{

    @Autowired
    ViewerRepository viewerRepository;

    public Viewer save(Viewer viewer)
    {
        return viewerRepository.save(viewer);
    }

    public Viewer update(long viewerId, Viewer viewer)
    {
        if(viewerId!=viewer.getViewerId())
            return null;
        return viewerRepository.save(viewer);
    }

    public void remove(long viewerId, Viewer viewer)
    {
        if(viewerId!=viewer.getViewerId())
            return;
        viewerRepository.delete(viewer);
    }

    public Viewer getViewer(long viewerId)
    {
        return viewerRepository.findById(viewerId).orElse(null);
    }

    public List<Viewer> getAllViewers()

    {
        return new ArrayList<>(viewerRepository.findAll());
    }
}

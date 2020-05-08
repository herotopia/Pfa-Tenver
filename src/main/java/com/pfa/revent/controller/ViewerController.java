package com.pfa.revent.controller;

import com.pfa.revent.entity.Viewer;
import com.pfa.revent.service.ViewerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ViewerController {
    @Autowired
    private ViewerService viewerService;

    @RequestMapping("/viewer/{viewerId}")
    public Viewer getViewer(@PathVariable long viewerId)
    {
        return viewerService.getViewer(viewerId);
    }

    @RequestMapping("/viewers")
    public List<Viewer> getAllViewers()
    {
        return viewerService.getAllViewers();
    }


    @RequestMapping(method= RequestMethod.POST, value="/viewer")
    public void addViewer(@RequestBody Viewer viewer)
    {
        viewerService.save(viewer);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/Viewer/{viewerId}")
    public void updateViewer(@RequestBody Viewer viewer, @PathVariable long viewerId)
    {
        viewerService.update(viewerId, viewer);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/viewer/{viewerId}")
    public void removeViewer(@RequestBody Viewer viewer, @PathVariable long viewerId)
    {
        viewerService.remove(viewerId, viewer);
    }
}

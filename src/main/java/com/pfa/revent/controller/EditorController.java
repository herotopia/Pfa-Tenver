package com.pfa.revent.controller;

import com.pfa.revent.entity.Editor;
import com.pfa.revent.service.EditorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EditorController {
    @Autowired
    private EditorService editorService;

    @RequestMapping("/editor/{editorId}")
    public Editor getEditor(@PathVariable long editorId)
    {
        return editorService.getEditor(editorId);
    }

    @RequestMapping("/editors")
    public List<Editor> getAllEditors()
    {
        return editorService.getAllEditors();
    }


    @RequestMapping(method= RequestMethod.POST, value="/editor")
    public void addEditor(@RequestBody Editor editor)
    {
        editorService.save(editor);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/Editor/{editorId}")
    public void updateEditor(@RequestBody Editor editor, @PathVariable long editorId)
    {
        editorService.update(editorId, editor);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/editor/{editorId}")
    public void removeEditor(@RequestBody Editor editor, @PathVariable long editorId)
    {
        editorService.remove(editorId, editor);
    }
}

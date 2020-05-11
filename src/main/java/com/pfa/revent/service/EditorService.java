package com.pfa.revent.service;

import com.pfa.revent.entity.Editor;
import com.pfa.revent.repository.EditorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EditorService implements EditorServiceInterface{
    @Autowired
    EditorRepository editorRepository;

    public Editor save(Editor editor)
    {
        return editorRepository.save(editor);
    }

    public Editor update(long editorId, Editor editor)
    {
        if(editorId!=editor.getEditorId())
            return null;
        return editorRepository.save(editor);
    }

    public void remove(long editorId, Editor editor)
    {
        if(editorId!=editor.getEditorId())
            return;
        editorRepository.delete(editor);
    }

    public Editor getEditor(long editorId)
    {
        return editorRepository.findById(editorId).orElse(null);
    }

    // edited
    public List<Editor> getAllEditors()

    {
        return new ArrayList<>(editorRepository.findAll());
    }
    /*
    public List<Utilisateur> getAllUtilisaters()

    {
        List<Editor> editors = new ArrayList<>();
        EditorRepository.findAll().forEach(editors::add);
        return editors;
    }*/
}

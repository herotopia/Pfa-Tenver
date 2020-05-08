package com.pfa.revent.service;

import com.pfa.revent.entity.Editor;

import java.util.List;

public interface EditorServiceInterface {
    Editor save(Editor editor);
    Editor update(long editorId, Editor editor);
    void remove(long editorId, Editor editor);
    Editor getEditor(long editorId);
    List<Editor> getAllEditors();
}

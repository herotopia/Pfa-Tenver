package com.pfa.revent.repository;

import com.pfa.revent.entity.Editor;
import com.pfa.revent.entity.Moderator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EditorRepository extends JpaRepository<Editor,Long> {
    Optional<Editor> findByEditorId(long editorId);
    List<Editor> getAllByEditorId(long editorId);
    List<Editor> getAllByParentModerator(Moderator parentModerator);
}

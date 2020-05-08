package com.pfa.revent.repository;

import com.pfa.revent.entity.User;
import com.pfa.revent.entity.Viewer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ViewerRepository extends JpaRepository<Viewer,Long> {
    Viewer findByViewerId(long viewerId);
    List<Viewer> getAllByViewerId(long viewerId);
}

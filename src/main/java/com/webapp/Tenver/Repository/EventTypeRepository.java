package com.webapp.Tenver.Repository;

import com.webapp.Tenver.Entity.EventType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventTypeRepository extends JpaRepository<EventType,Long> {
}

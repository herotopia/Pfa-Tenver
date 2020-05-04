package com.webapp.Tenver.Repository;

import com.webapp.Tenver.Entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event,Long> {
}

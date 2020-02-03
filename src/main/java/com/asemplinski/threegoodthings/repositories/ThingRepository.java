package com.asemplinski.threegoodthings.repositories;

import com.asemplinski.threegoodthings.domain.Thing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ThingRepository extends JpaRepository<Thing, Long> {
}

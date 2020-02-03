package com.asemplinski.ThreeGoodThings.repositories;

import com.asemplinski.ThreeGoodThings.domain.Thing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ThingRepository extends JpaRepository<Thing, Long> {
}

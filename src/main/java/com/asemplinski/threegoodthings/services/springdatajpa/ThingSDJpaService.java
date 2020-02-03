package com.asemplinski.threegoodthings.services.springdatajpa;

import com.asemplinski.threegoodthings.api.v1.mapper.ThingMapper;
import com.asemplinski.threegoodthings.domain.Thing;
import com.asemplinski.threegoodthings.repositories.ThingRepository;
import com.asemplinski.threegoodthings.services.ThingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ThingSDJpaService implements ThingService {

    ThingRepository thingRepository;

    @Autowired
    ThingMapper thingMapper;

    public ThingSDJpaService(ThingRepository thingRepository, ThingMapper thingMapper) {
        this.thingRepository = thingRepository;
        this.thingMapper = thingMapper;
    }

    @Override
    public Set<Thing> findall() {
        return null;
    }

    @Override
    public Thing findById(Long aLong) {
        return null;
    }

    @Override
    public Thing save(Thing object) {
        return null;
    }

    @Override
    public void delete(Thing object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}

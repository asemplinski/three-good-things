package com.asemplinski.threegoodthings.services.springdatajpa;

import com.asemplinski.threegoodthings.api.v1.mapper.ThingMapper;
import com.asemplinski.threegoodthings.domain.Thing;
import com.asemplinski.threegoodthings.repositories.ThingRepository;
import com.asemplinski.threegoodthings.services.ThingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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


    public List<Thing> findall() {
        return null;
    }


    public Thing findById(Long aLong) {
        return null;
    }


    public Thing save(Thing object) {
        return null;
    }

    public void delete(Thing object) {

    }

    public void deleteById(Long aLong) {

    }
}

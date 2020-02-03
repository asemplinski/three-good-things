package com.asemplinski.threegoodthings.services.springdatajpa;

import com.asemplinski.threegoodthings.api.v1.mapper.DayMapper;
import com.asemplinski.threegoodthings.domain.Day;
import com.asemplinski.threegoodthings.repositories.DayRepository;
import com.asemplinski.threegoodthings.services.DayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class DaySDJpaService implements DayService {


    private final DayRepository dayRepository;

    @Autowired
    private final DayMapper dayMapper;

    public DaySDJpaService(DayRepository dayRepository, DayMapper dayMapper) {
        this.dayRepository = dayRepository;
        this.dayMapper = dayMapper;
    }


    @Override
    public Set<Day> findall() {

        Set<Day> daysToReturn = new HashSet<>();
        dayRepository.findAll().forEach(daysToReturn::add);

        return daysToReturn;
    }

    @Override
    public Day findById(Long aLong) {

        return dayRepository.findById(aLong).orElse(null);
    }



    @Override
    public Day save(Day object) {
        return dayRepository.save(object);
    }

    @Override
    public void delete(Day object) {
        dayRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        dayRepository.deleteById(aLong);
    }
}

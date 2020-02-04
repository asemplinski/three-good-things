package com.asemplinski.threegoodthings.services.springdatajpa;

import com.asemplinski.threegoodthings.api.v1.mapper.DayMapper;
import com.asemplinski.threegoodthings.api.v1.model.DayDTO;
import com.asemplinski.threegoodthings.domain.Day;
import com.asemplinski.threegoodthings.repositories.DayRepository;
import com.asemplinski.threegoodthings.services.DayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class DaySDJpaService implements DayService {


    private final DayRepository dayRepository;

    @Autowired
    private final DayMapper dayMapper;

    public DaySDJpaService(DayRepository dayRepository, DayMapper dayMapper) {
        this.dayRepository = dayRepository;
        this.dayMapper = dayMapper;
    }


    private DayDTO saveAndReturnDTO(Day day){

        Day savedDay = dayRepository.save(day);

        DayDTO returnDTO = dayMapper.dayToDayDTO(savedDay);

        return returnDTO;
    }


    @Override
    public List<DayDTO> getAllDays() {
        return dayRepository.findAll()
                .stream()
                .map(dayMapper::dayToDayDTO)
                .collect(Collectors.toList());
    }

    @Override
    public DayDTO getDayByDate(LocalDate date) {
        return null;
    }


    @Override
    public DayDTO getDayById(Long id) {
        return dayMapper.dayToDayDTO(dayRepository.findDayById(id));
    }

    @Override
    public DayDTO createNewDay(DayDTO dayDTO) {

        return saveAndReturnDTO(dayMapper.dayDTOToDay(dayDTO));
    }


    @Override
    public void deleteDayById(Long id) {

    }
}

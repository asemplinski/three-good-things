package com.asemplinski.threegoodthings.services;

import com.asemplinski.threegoodthings.api.v1.model.DayDTO;
import com.asemplinski.threegoodthings.domain.Day;

import java.time.LocalDate;
import java.util.List;

public interface DayService{

    List<DayDTO> getAllDays();

    DayDTO getDayByDate(LocalDate date);

    DayDTO getDayById(Long id);

    DayDTO createNewDay(DayDTO dayDTO);


    void deleteDayById(Long id);



}

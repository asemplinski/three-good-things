package com.asemplinski.threegoodthings.services.springdatajpa;

import com.asemplinski.threegoodthings.api.v1.mapper.DayMapper;
import com.asemplinski.threegoodthings.api.v1.mapper.ThingMapper;
import com.asemplinski.threegoodthings.api.v1.model.DayDTO;
import com.asemplinski.threegoodthings.api.v1.model.ThingDTO;
import com.asemplinski.threegoodthings.domain.Day;
import com.asemplinski.threegoodthings.domain.Thing;
import com.asemplinski.threegoodthings.repositories.DayRepository;
import com.asemplinski.threegoodthings.repositories.ThingRepository;
import com.asemplinski.threegoodthings.services.DayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class DaySDJpaService implements DayService {


    private final DayRepository dayRepository;
    private final ThingRepository thingRepository;

    @Autowired
    private final DayMapper dayMapper;
    @Autowired
    private final ThingMapper thingMapper;

    public DaySDJpaService(DayRepository dayRepository, ThingRepository thingRepository, DayMapper dayMapper, ThingMapper thingMapper) {
        this.dayRepository = dayRepository;
        this.thingRepository = thingRepository;
        this.dayMapper = dayMapper;
        this.thingMapper = thingMapper;
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
        Day day = dayMapper.dayDTOToDay(dayDTO);

        List<ThingDTO> thingDTOs = dayDTO.getThings();
        List<Thing> things = new ArrayList<>();
        for(ThingDTO thingIterator: thingDTOs){

            Thing thing = thingMapper.thingDTOToThing(thingIterator);
            thing.setDay(day);
            things.add(thing);
            thingRepository.save(thing);
            //dayDTO =  dayMapper.dayToDayDTO(thing.getDay());
        }
        day.setThisDaysThings(things);
        dayRepository.save(day);
        //DayDTO savedDay = saveAndReturnDTO(dayMapper.dayDTOToDay(dayDTO));
        DayDTO returnDTO = dayMapper.dayToDayDTO(day);
        return dayDTO;
    }


    @Override
    public void deleteDayById(Long id) {

    }
}

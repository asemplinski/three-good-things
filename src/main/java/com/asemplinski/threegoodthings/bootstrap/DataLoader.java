package com.asemplinski.threegoodthings.bootstrap;

import com.asemplinski.threegoodthings.domain.Day;
import com.asemplinski.threegoodthings.domain.Thing;
import com.asemplinski.threegoodthings.repositories.DayRepository;
import com.asemplinski.threegoodthings.repositories.ThingRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    ThingRepository thingRepository;
    DayRepository dayRepository;

    public DataLoader(ThingRepository thingRepository, DayRepository dayRepository) {
        this.thingRepository = thingRepository;
        this.dayRepository = dayRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("It's starting");

        Thing firstThing = Thing.builder().thing("Da Boys").daysOrder(1).build();
        Thing secondThing = Thing.builder().thing("Utah").daysOrder(2).build();
        Thing thirdThing = Thing.builder().thing("Colorado").daysOrder(3).build();

        System.out.println("Building List");
        List<Thing> firstDaysThings = new ArrayList<Thing>();

        System.out.println("adding to list");
        firstDaysThings.add(firstThing);
        firstDaysThings.add(secondThing);
        firstDaysThings.add(thirdThing);

        LocalDate day1 =  LocalDate.of(2020, 2, 3);
        Day firstDay = Day.builder().date(day1).thisDaysThings(firstDaysThings).build();

        firstThing.setDay(firstDay);
        secondThing.setDay(firstDay);
        thirdThing.setDay(firstDay);

        dayRepository.save(firstDay);

        thingRepository.save(firstThing);
        thingRepository.save(secondThing);
        thingRepository.save(thirdThing);

        System.out.println("Data was loaded!");


    }
}

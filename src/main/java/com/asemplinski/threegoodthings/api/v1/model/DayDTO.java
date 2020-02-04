package com.asemplinski.threegoodthings.api.v1.model;

import com.asemplinski.threegoodthings.domain.Thing;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class DayDTO {

    private Long id;
    private LocalDate date;

    private List<ThingDTO> things;

}

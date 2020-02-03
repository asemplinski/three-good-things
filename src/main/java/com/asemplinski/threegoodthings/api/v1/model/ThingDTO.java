package com.asemplinski.threegoodthings.api.v1.model;


import com.asemplinski.threegoodthings.domain.Day;
import lombok.Data;


@Data
public class ThingDTO {

    private Long id;
    private Integer daysOrder;
    private String thing;

    Day day;
}

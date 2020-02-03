package com.asemplinski.threegoodthings.api.v1.mapper;


import com.asemplinski.threegoodthings.api.v1.model.DayDTO;
import com.asemplinski.threegoodthings.domain.Day;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;



@Mapper
public interface DayMapper {

    DayMapper INSTANCE = Mappers.getMapper(DayMapper.class);

    @Mapping(source = "id", target="id")
    DayDTO dayToDayDTO(Day day);

    @Mapping(source = "id", target = "id")
    Day dayDTOToDay(DayDTO dayDTO);


}

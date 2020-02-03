package com.asemplinski.threegoodthings.api.v1.mapper;

import com.asemplinski.threegoodthings.api.v1.model.ThingDTO;
import com.asemplinski.threegoodthings.domain.Thing;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ThingMapper {

    ThingMapper INSTANCE = Mappers.getMapper(ThingMapper.class);

    @Mapping(source = "id", target="id")
    ThingDTO thingToThingDTO(Thing thing);


    @Mapping(source = "id", target = "id")
    Thing thingDTOToThing(ThingDTO thingDTO);

}

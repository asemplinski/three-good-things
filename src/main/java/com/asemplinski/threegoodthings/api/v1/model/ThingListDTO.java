package com.asemplinski.threegoodthings.api.v1.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ThingListDTO {
    List<ThingDTO> things;
}

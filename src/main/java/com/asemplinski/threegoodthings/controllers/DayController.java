package com.asemplinski.threegoodthings.controllers;


import com.asemplinski.threegoodthings.api.v1.model.DayDTO;
import com.asemplinski.threegoodthings.services.DayService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/days")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DayController {

    private final DayService dayService;

    public DayController(DayService dayService) {
        this.dayService = dayService;
    }


    @GetMapping()
    public List<DayDTO> getAllDays(){
        return dayService.getAllDays();
    }

    @PostMapping()
    public DayDTO createNewDay(@RequestBody DayDTO dayDTO){

        return dayService.createNewDay(dayDTO);
    }



}

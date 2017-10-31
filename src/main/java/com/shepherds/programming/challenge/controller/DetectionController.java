package com.shepherds.programming.challenge.controller;

import com.shepherds.programming.challenge.Event;
import com.shepherds.programming.challenge.EventResponse;
import com.shepherds.programming.challenge.service.DetectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by youssefsiblini on 30/10/2017.
 */
@RestController
@RequestMapping("api/event")
public class DetectionController {

    @Autowired
    private DetectionService detectionService;

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public EventResponse addEvent(@RequestBody Event event)
    {
        return detectionService.addEvent(event);
    }

}

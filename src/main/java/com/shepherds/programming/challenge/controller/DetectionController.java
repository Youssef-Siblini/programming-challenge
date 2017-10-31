package com.shepherds.programming.challenge.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shepherds.programming.challenge.Event;
import com.shepherds.programming.challenge.EventResponse;
import com.shepherds.programming.challenge.config.models.SensorConfig;
import com.shepherds.programming.challenge.config.models.SensorConfigModel;
import com.shepherds.programming.challenge.service.DetectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by youssefsiblini on 30/10/2017.
 */
@RestController
@RequestMapping("api/event")
public class DetectionController {

    @Autowired
    private DetectionService detectionService;

    Map<String, SensorConfigModel> mapSennsorIdToSensorConfigModel = new HashMap();

    @PostConstruct
    public void init() throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        SensorConfig sensorConfig = null;

        sensorConfig = mapper.readValue(new ClassPathResource("sensorconfig.json").getFile(), SensorConfig.class);
//        sensorConfig = mapper.readValue(new File("sensorconfig.json"), SensorConfig.class);

        for (SensorConfigModel sensorConfigModel : sensorConfig.getSensorconfigmodel())
            mapSennsorIdToSensorConfigModel.put(sensorConfigModel.getSensorId(), sensorConfigModel);

    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public EventResponse addEvent(@RequestBody Event event)
    {

        if(mapSennsorIdToSensorConfigModel.get(event.getSensorId()) == null) {
            return detectionService.addEvent(event, true, true);
        } else {

            double threshold = mapSennsorIdToSensorConfigModel.get(event.getSensorId()).getThreshold();
            boolean isAnomaly = event.getValue() < threshold ? false : true;
            return detectionService.addEvent(event, isAnomaly, false);

        }
    }

}

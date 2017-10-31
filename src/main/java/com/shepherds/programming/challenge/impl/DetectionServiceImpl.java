package com.shepherds.programming.challenge.impl;

import com.shepherds.programming.challenge.Event;
import com.shepherds.programming.challenge.EventResponse;
import com.shepherds.programming.challenge.service.DetectionService;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by youssefsiblini on 30/10/2017.
 */

@Component
public class DetectionServiceImpl implements DetectionService {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public EventResponse addEvent(Event event)
    {
        logger.info("Logged event with id: {}", event.getEventId());

        EventResponse eventResponse = new EventResponse();

        eventResponse.setValue(event.getValue());
        eventResponse.setSensorId(event.getSensorId());
        eventResponse.setTimestamp(event.getTimestamp());
        eventResponse.setEventId(event.getEventId());
        eventResponse.setStatus(EventResponse.Status.NO_MODEL);
        eventResponse.setCause("");
        eventResponse.setMessage("");


        return eventResponse;
    }
}

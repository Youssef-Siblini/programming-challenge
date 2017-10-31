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
    public EventResponse addEvent(Event event, boolean isAnomaly, boolean isEmpty)
    {

        EventResponse eventResponse = new EventResponse(event);

        if(isEmpty) {

            logger.info("Logged event with id {} with NO_MODEL status", event.getEventId());
            eventResponse.setStatus(EventResponse.Status.NO_MODEL);

        } else {

            if(isAnomaly) {

                logger.info("Logged event with id {} as ANOMALY status", event.getEventId());
                eventResponse.setStatus(EventResponse.Status.ANOMALY);

            } else {

                logger.info("Logged event with id {} as NO_ANOMALY status", event.getEventId());
                eventResponse.setStatus(EventResponse.Status.NO_ANOMALY);

            }

        }
        eventResponse.setCause("");
        eventResponse.setMessage("");


        return eventResponse;
    }
}

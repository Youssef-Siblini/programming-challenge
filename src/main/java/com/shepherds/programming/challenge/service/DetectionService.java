package com.shepherds.programming.challenge.service;

import com.shepherds.programming.challenge.Event;
import com.shepherds.programming.challenge.EventResponse;

/**
 * Created by youssefsiblini on 30/10/2017.
 */
public interface DetectionService {

    EventResponse addEvent(Event event, boolean isAnomaly, boolean isEmpty);
}

package com.shepherds.programming.challenge;

import javax.validation.constraints.NotNull;

/**
 * Created by youssefsiblini on 30/10/2017.
 */
public class Event {

    private String eventId;
    private String sensorId;
    private int timestamp;
    private double value;

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}

package com.shepherds.programming.challenge;

import javax.validation.constraints.NotNull;

/**
 * Created by youssefsiblini on 31/10/2017.
 */
public class EventResponse {

    public enum Status
    {
        NO_MODEL, NO_ANOMALY, ANOMALY, ERROR
    }

    @NotNull(message="err.eventId.required")
    private String eventId;

    @NotNull(message="err.sensorId.required")
    private String sensorId;

    @NotNull(message="err.timestamp.required")
    private int timestamp;

    @NotNull(message="err.value.required")
    private double value;

    @NotNull(message="err.status.required")
    private Status status;

    @NotNull(message="err.cause.required")
    private String cause;

    @NotNull(message="err.message.required")
    private String message;

    public EventResponse(Event event) {

        this.eventId = event.getEventId();
        this.sensorId = event.getSensorId();
        this.timestamp = event.getTimestamp();
        this.value = event.getValue();
    }

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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

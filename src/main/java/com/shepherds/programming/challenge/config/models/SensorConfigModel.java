package com.shepherds.programming.challenge.config.models;

/**
 * Created by youssefsiblini on 31/10/2017.
 */
public class SensorConfigModel {

    private String sensorId;
    private String model;
    private double threshold;

    public SensorConfigModel() {
    }

    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getThreshold() {
        return threshold;
    }

    public void setThreshold(double threshold) {
        this.threshold = threshold;
    }

    @Override
    public String toString() {
        return getSensorId() + ", " + getModel() + ", " + getThreshold();
    }

}

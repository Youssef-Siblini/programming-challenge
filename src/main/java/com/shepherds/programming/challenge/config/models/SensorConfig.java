package com.shepherds.programming.challenge.config.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by youssefsiblini on 31/10/2017.
 */
public class SensorConfig {

    private List<SensorConfigModel> sensorconfigmodel = new ArrayList();

    public List<SensorConfigModel> getSensorconfigmodel() {
        return sensorconfigmodel;
    }

    public void setSensorconfigmodel(List<SensorConfigModel> sensorconfigmodel) {
        this.sensorconfigmodel = sensorconfigmodel;
    }

    @Override
    public String toString() {
        return "Sensors config: ["  + sensorconfigmodel + "]";
    }

}

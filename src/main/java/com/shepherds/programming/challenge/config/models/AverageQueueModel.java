package com.shepherds.programming.challenge.config.models;

import com.shepherds.programming.challenge.Event;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by youssefsiblini on 01/11/2017.
 */
public class AverageQueueModel {

    private Queue<Event> window;
    private int WINDOW_MAX_SIZE = 3;  // should be configurable
    public static final int THRESHHOLD = 31;

    public AverageQueueModel () {
        window = new LinkedList();
    }

    public void changeWindowMaxSize(int maxSize) {

        if (maxSize < 0)
            throw new IllegalArgumentException("Window max size must be positive");

        this.WINDOW_MAX_SIZE = maxSize;
    }

    public boolean addEvent(Event event) {

        if (event == null)
            throw new IllegalArgumentException();

        if (window.size() == WINDOW_MAX_SIZE)
            window.remove();

        window.add(event);
        return true;
    }

    public Queue getWindow() {
        return this.window;
    }

    public double getValuesAverage () {

        double valuesSum = 0;
        for (Event event : window) {
            valuesSum += event.getValue();
        }
        return valuesSum/window.size();
    }

}

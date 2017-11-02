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
    public static final int THRESHHOLD = 10;

    public AverageQueueModel () {
        window = new LinkedList();
    }

    public void changeWindowMaxSize(int maxSize) {

    }

    public boolean addEvent(Event event) {

        return false;
    }

    public Queue getWindow() {
        return this.window;
    }

    public double getValuesAverage () {
        return 0.0;
    }

}

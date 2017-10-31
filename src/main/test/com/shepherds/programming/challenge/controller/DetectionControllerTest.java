package com.shepherds.programming.challenge.controller;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

/**
 * Created by youssefsiblini on 31/10/2017.
 */
public class DetectionControllerTest extends TestCase {

    @Test
    public void testAddEventNoModelResponse()
    {
        Map map = generateMapWithValue("19.0", false, true);
        given()
                .body(map)
                .contentType("application/json")
                .when().post("/event").then().body("status", equalTo(EventStatus.NO_MODEL));
    }

    private Map generateMapWithValue(final String value, boolean isCUID, boolean isUUID) {
        Map map = new HashMap();

        if(isCUID)
            map.put("eventId", "cj86g5ypk000004zvevipqxfn");
        else
            map.put("eventId", "ojojihd");

        if(isUUID)
            map.put("sensorId", "fd0a635d-2aaf-4460-a817-6353e1b6c050");
        else
            map.put("sensorId", "jdhdkkdhdu");

        map.put("value", value);
        map.put("timestamp", 23450393);

        return map;
    }
}
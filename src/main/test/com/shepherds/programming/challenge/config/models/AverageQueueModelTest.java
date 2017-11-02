package com.shepherds.programming.challenge.config.models;

import com.shepherds.programming.challenge.Event;
import org.junit.Test;

import java.util.Queue;

import static org.junit.Assert.*;

/**
 * Created by youssefsiblini on 01/11/2017.
 */
public class AverageQueueModelTest {

    @Test(expected = IllegalArgumentException.class)
    public void testChangeWindowMaxSizeNegativeArgument() {
        AverageQueueModel averageQueueModel = new AverageQueueModel();
        averageQueueModel.changeWindowMaxSize(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddEventNullArgument() {

        AverageQueueModel averageQueueModel = new AverageQueueModel();
        averageQueueModel.addEvent(null);
    }

    @Test
    public void testAddEvent() throws Exception {

        AverageQueueModel averageQueueModel = new AverageQueueModel();
        averageQueueModel.addEvent(new Event() {{ setValue(1.0); }});
        averageQueueModel.addEvent(new Event() {{ setValue(2.0); }} );
        averageQueueModel.addEvent(new Event() {{ setValue(3.0); }});

        assertEquals(3, averageQueueModel.getWindow().size());
        assertEquals(1.0, ((Event) averageQueueModel.getWindow().element()).getValue(), 0.01);

        averageQueueModel.addEvent(new Event() {{ setValue(4.0); }});
        assertEquals( 3, averageQueueModel.getWindow().size() );
        assertEquals(2.0, ((Event) averageQueueModel.getWindow().element()).getValue(), 0.01);

    }

    @Test
    public void testGetValuesAverage() throws Exception {

        AverageQueueModel averageQueueModel = new AverageQueueModel();

        averageQueueModel.addEvent(new Event() {{ setValue(1.0); }});
        averageQueueModel.addEvent(new Event() {{ setValue(2.0); }} );
        averageQueueModel.addEvent(new Event() {{ setValue(3.0); }});

        assertNotEquals(1, averageQueueModel.getValuesAverage(), 0.01);
        assertEquals(2.0, averageQueueModel.getValuesAverage(), 0.01);
    }
}
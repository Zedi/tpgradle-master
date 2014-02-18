package com.ninja_squad.gradle;

import com.ninja_squad.gradle.services.Clock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for Clock
 * @author JB Nizet
 */
public class ClockTest {

    private Clock clock;

    @Before
    public void prepare() {
        clock = new Clock();
    }

    @Test
    public void testGetTime() {
        String time = clock.getTime();
        assertEquals(8, time.length());
        assertTrue(time.contains(":"));
    }
}

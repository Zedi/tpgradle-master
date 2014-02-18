package com.ninja_squad.gradle.services;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Stupid class allowing to get the time of the day
 * @author JB Nizet
 */
public class Clock {
    private static final String pattern = "HH:mm:ss";

    public Clock() {
    }

    /**
     * Returns the current time
     * @return the current time
     */
    public String getTime() {
        DateFormat df = new SimpleDateFormat(pattern);
        return df.format(new Date());
    }
}

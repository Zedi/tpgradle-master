package com.ninja_squad.gradle;

import com.ninja_squad.gradle.services.Clock;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A frame displaying a clock
 * @author JB Nizet
 */
public class ClockFrame extends JFrame {
    JLabel clockLabel;

    public ClockFrame() {
        super("Clock");
        final Clock clock = new Clock();
        clockLabel = new JLabel(clock.getTime());
        clockLabel.setFont(clockLabel.getFont().deriveFont(64F));
        add(clockLabel);
        pack();
        new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clockLabel.setText(clock.getTime());
            }
        }).start();
    }
}

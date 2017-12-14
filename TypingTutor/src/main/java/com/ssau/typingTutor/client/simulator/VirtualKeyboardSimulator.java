package com.ssau.typingTutor.client.simulator;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.uibinder.client.UiBinder;

public class VirtualKeyboardSimulator {
    interface VirtualKeyboardSimulatorUiBinder extends UiBinder<DivElement, VirtualKeyboardSimulator> {
    }

    private static VirtualKeyboardSimulatorUiBinder ourUiBinder = GWT.create(VirtualKeyboardSimulatorUiBinder.class);

    public VirtualKeyboardSimulator() {
        DivElement rootElement = ourUiBinder.createAndBindUi(this);
    }
}
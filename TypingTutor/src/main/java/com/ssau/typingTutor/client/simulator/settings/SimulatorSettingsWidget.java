package com.ssau.typingTutor.client.simulator.settings;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.uibinder.client.UiBinder;

public class SimulatorSettingsWidget {
    interface SimulatorSettingsWidgetUiBinder extends UiBinder<DivElement, SimulatorSettingsWidget> {
    }

    private static SimulatorSettingsWidgetUiBinder ourUiBinder = GWT.create(SimulatorSettingsWidgetUiBinder.class);

    public SimulatorSettingsWidget() {
        DivElement rootElement = ourUiBinder.createAndBindUi(this);
    }
}
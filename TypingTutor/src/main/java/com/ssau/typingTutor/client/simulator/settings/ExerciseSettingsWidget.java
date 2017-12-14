package com.ssau.typingTutor.client.simulator.settings;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.uibinder.client.UiBinder;

public class ExerciseSettingsWidget {
    interface ExerciseSettingsWidgetUiBinder extends UiBinder<DivElement, ExerciseSettingsWidget> {
    }

    private static ExerciseSettingsWidgetUiBinder ourUiBinder = GWT.create(ExerciseSettingsWidgetUiBinder.class);

    public ExerciseSettingsWidget() {
        DivElement rootElement = ourUiBinder.createAndBindUi(this);
    }
}
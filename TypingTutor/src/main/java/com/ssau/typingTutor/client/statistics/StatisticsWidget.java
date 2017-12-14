package com.ssau.typingTutor.client.statistics;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.uibinder.client.UiBinder;

public class StatisticsWidget {
    interface StatisticsWidgetUiBinder extends UiBinder<DivElement, StatisticsWidget> {
    }

    private static StatisticsWidgetUiBinder ourUiBinder = GWT.create(StatisticsWidgetUiBinder.class);

    public StatisticsWidget() {
        DivElement rootElement = ourUiBinder.createAndBindUi(this);
    }
}
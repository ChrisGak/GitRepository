package com.ssau.typingTutor.client.authorization;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.uibinder.client.UiBinder;

public class AccountEditWidget {
    interface AccountEditWidgetUiBinder extends UiBinder<DivElement, AccountEditWidget> {
    }

    private static AccountEditWidgetUiBinder ourUiBinder = GWT.create(AccountEditWidgetUiBinder.class);

    public AccountEditWidget() {
        DivElement rootElement = ourUiBinder.createAndBindUi(this);
    }
}
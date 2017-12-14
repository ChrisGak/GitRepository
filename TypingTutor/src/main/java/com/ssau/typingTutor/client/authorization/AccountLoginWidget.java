package com.ssau.typingTutor.client.authorization;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.uibinder.client.UiBinder;

public class AccountLoginWidget {
    interface LoginUiBinder extends UiBinder<DivElement, AccountLoginWidget> {
    }

    private static LoginUiBinder ourUiBinder = GWT.create(LoginUiBinder.class);

    public AccountLoginWidget() {
        DivElement rootElement = ourUiBinder.createAndBindUi(this);
    }
}
package com.ssau.typingTutor.client.authorization;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.uibinder.client.UiBinder;

public class RegisterAccountWidget {
    interface RegistrationUiBinder extends UiBinder<DivElement, RegisterAccountWidget> {
    }

    private static RegistrationUiBinder ourUiBinder = GWT.create(RegistrationUiBinder.class);

    public RegisterAccountWidget() {
        DivElement rootElement = ourUiBinder.createAndBindUi(this);
    }
}
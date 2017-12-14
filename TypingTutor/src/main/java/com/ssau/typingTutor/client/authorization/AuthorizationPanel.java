package com.ssau.typingTutor.client.authorization;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.*;
import com.ssau.typingTutor.client.Constants;

/**
 * Created by Chris on 09.12.2017.
 */
public class AuthorizationPanel {

    public static Widget createWidget(){
        Button log_into = new Button();
        log_into.setText(Constants.AUTHORISE);
        log_into.setTitle(Constants.AUTHORISE);
        log_into.addStyleName(Constants.BUTTON_ROUNDED);
        log_into.addClickHandler(authoriseClickHandler);
        return log_into;
    }


    private static ClickHandler authoriseClickHandler = new ClickHandler() {
        public void onClick(ClickEvent event) {
            RootPanel.get(Constants.APPLICATION_MAIN).setVisible(false);
            AccountLoginWidget loginForm = new AccountLoginWidget();
            RootPanel.get(Constants.APPLICATION).add((IsWidget) loginForm);
        }
    };
}

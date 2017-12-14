package com.ssau.typingTutor.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface TypingTutorServiceAsync {
    void getMessage(String msg, AsyncCallback<String> async);
}

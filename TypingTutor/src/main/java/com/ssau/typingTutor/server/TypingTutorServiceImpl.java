package com.ssau.typingTutor.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.ssau.typingTutor.client.TypingTutorService;

public class TypingTutorServiceImpl extends RemoteServiceServlet implements TypingTutorService {
    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}
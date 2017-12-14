package com.ssau.typingTutor.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("TypingTutorService")
public interface TypingTutorService extends RemoteService {
    // Sample interface method of remote interface
    String getMessage(String msg);

    /**
     * Utility/Convenience class.
     * Use TypingTutorService.App.getInstance() to access static instance of TypingTutorServiceAsync
     */
    public static class App {
        private static TypingTutorServiceAsync ourInstance = GWT.create(TypingTutorService.class);

        public static synchronized TypingTutorServiceAsync getInstance() {
            return ourInstance;
        }
    }
}

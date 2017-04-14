package com.ramazan;

/**
 * Created by ramazan on 14.04.2017.
 */
public class MailServerUnavailableException {
    public MailServerUnavailableException(String test) {
    }

    public Exception MailServerUnavailableException(String mesaj) {
        return new RuntimeException(mesaj);
    }
}

package it.unibo.exceptions.fakenetwork.api;

import java.io.IOException;
//import java.util.Objects;

public class NetworkException extends IOException {
    public NetworkException(){
        super("Network Error: no response");
    }

    public NetworkException(final String messageSent){
        super("Network error while sending message: " + messageSent);
    }
}

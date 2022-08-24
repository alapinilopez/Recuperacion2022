package edu.poniperro.proxypattern.mrmeeseeks;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

public class MrMeeseeks {
    private static AtomicInteger ID_GENERATOR;
    private Integer id;
    private String[] messageOnRequest;
    private String messageOnExplode;
    private String[] request;
    private List<String> requestAsList;

    public MrMeeseeks(){}

    public Integer getId() {
        return id;
    }

    public String[] getMessageOnRequest() {
        return messageOnRequest;
    }

    public void setRequest(String request) {
        this.request = request.split(" ");
        this.requestAsList = Arrays.asList(this.request);
    }

    public String getRequest() {
        return String.join(" ", this.request);
    }

    public int lengthMessageOnRequest()  {
        return messageOnRequest.length;
    }

    public void sayMessageOnCreate() {

    }

    public void sayMessageOnRequest() {
    }

    public String generateMessageOnRequest() {
        return null;
    }

    public void sayMessageOnDone() {

    }

    public void sayMessageOnExplode() {

    }

    public void formulateRequest(String request) {
        this.setRequest(request);
        // this.getRequest();

    }

    public void fulfillRequest() {

    }

    public void doRequest(String request1, String request2) {

    }

    public void stopExisting() {

    }
}

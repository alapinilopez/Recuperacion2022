package edu.poniperro.proxypattern.mrmeeseeks;

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

    public void setRequest(String[] request) {
        this.request = request;
    }

    public String[] getRequest() {
        return request;
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
        this.getRequest();

    }

    public void fulfillRequest() {

    }

    public void doRequest(String, String) {

    }

    public void stopExisting() {

    }
}

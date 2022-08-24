package edu.poniperro.proxypattern.mrmeeseeks;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class MrMeeseeks implements Doable{
    private static AtomicInteger ID_GENERATOR = new AtomicInteger(1001);
    private Integer id;
    private String[] messageOnRequest;
    private String messageOnExplode;
    private String[] request;
    private List<String> requestAsList; //Nunca se usa ¿?

    public MrMeeseeks() { //
        id = MrMeeseeks.ID_GENERATOR.getAndAdd(1);
        this.sayMessageOnCreate();
        this.messageOnRequest = new String[]{"Oooh yeah, can do!", "Oooh yeah, yes ma'am"};
        this.messageOnExplode = "Poooooof " + this.id;

    }

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

    private int lengthMessageOnRequest()  {
        return messageOnRequest.length;
    }

    public void sayMessageOnCreate() {
        System.out.println("I'm Mr Meeseeks " + this.id + ". Look at meeee!");
    }

    public void sayMessageOnRequest() {
        System.out.println(generateMessageOnRequest());
    }

    private String generateMessageOnRequest() {
        return this.messageOnRequest[new Random().nextInt(lengthMessageOnRequest())] ;
    }

    public void sayMessageOnDone() {
        System.out.println("All done! \n");
    }

    public void sayMessageOnExplode() {
        System.out.println(this.messageOnExplode);
    }

    public void formulateRequest(String request) {
        this.setRequest(request);
        this.fulfillRequest();
    }

    public void fulfillRequest() {
        this.sayMessageOnRequest();
        this.doRequest("String", this.getRequest());
        this.sayMessageOnDone();
    }

    private void stopExisting() {
        //no sé dónde emplearlo :(
        //borrar de la lista?
    }

    @Override
    public void doRequest(String type, String request) {
        System.out.println(request);
    }

    @Override
    public String toString() {
        return this.getId().toString();
    }

}

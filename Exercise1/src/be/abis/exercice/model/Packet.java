package be.abis.exercice.model;

public class Packet {
    private String destinationAdress;
    private String context;

    public Packet(String destinationAdress, String context) {
        this.destinationAdress = destinationAdress;
        this.context = context;
    }

    public String getDestinationAdress() {
        return destinationAdress;
    }

    public void setDestinationAdress(String destinationAdress) {
        this.destinationAdress = destinationAdress;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}

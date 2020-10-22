package be.abis.exercice.model;

public class WorkStation extends Node {
    public WorkStation(String adress) {
        super(adress);
    }

    public void originate(Packet packet){
        this.getNextComponent().send(packet);
    }
}

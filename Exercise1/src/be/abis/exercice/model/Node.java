package be.abis.exercice.model;

public class Node extends LanComponent{

    public Node(String address) {
        super(address);
    }

    public void receive(Packet packet) {
        System.out.println(" Node just receive and send packet");
        this.send(packet);
    }


    public void send(Packet packet) {
        this.getNextComponent().receive(packet);
    }


}

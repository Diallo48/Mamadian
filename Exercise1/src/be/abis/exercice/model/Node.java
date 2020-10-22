package be.abis.exercice.model;

public abstract class Node extends LanComponent{
    public Node(String adress) {
        super(adress);
    }

    @Override
    public void send(Packet packet) {
    this.getNextComponent().send(packet);

    }

    @Override
    public void received(Packet packet) {
    this.getNextComponent().received(packet);
    }
}

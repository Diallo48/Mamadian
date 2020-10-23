package be.abis.exercice.model;

public abstract class PacketHandler extends Node{

    public PacketHandler(String address) {
        super(address);
    }

    public void receive(Packet packet) {
        if (this.getAddress().equals(packet.getDestinationAddress())){
            this.handle(packet);
        }else{
            this.send(packet);
        }
    }

    public abstract void  handle(Packet packet);





}

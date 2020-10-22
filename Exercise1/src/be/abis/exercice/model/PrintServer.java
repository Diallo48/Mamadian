package be.abis.exercice.model;

public class PrintServer extends Node {
    public PrintServer(String address) {
        super(address);
    }

    @Override
    public void receive(Packet packet) {
        if (this.getAddress().equals(packet.getDestinationAddress())){
            this.print(packet);
        }else{
            this.send(packet);
        }
    }

    public void print(Packet packet){
        System.out.println("The print "+this.getAddress()+ " printed your message "+ packet.getContents());

        }



}


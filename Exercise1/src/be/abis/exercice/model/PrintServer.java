package be.abis.exercice.model;

public class PrintServer extends Node {
    public PrintServer(String adress) {
        super(adress);
    }

    public void printPacket (Packet packet){
        if (this.getAdress().equals(packet.getDestinationAdress())){
            System.out.println(packet.toString()+" is printed by" + this.getAdress());
            printPacket(packet);
        }else{
            this.send(packet);
        }
        }


    }


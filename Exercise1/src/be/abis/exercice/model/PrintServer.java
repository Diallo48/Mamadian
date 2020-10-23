package be.abis.exercice.model;

public class PrintServer extends PacketHandler {
    PrinterStrategy printerStrategy;

    /*public PrintServer(String address) {
        super(address);
    }*/

    public PrintServer(String address, PrinterStrategy printerStrategy) {
        super(address);
        this.printerStrategy = printerStrategy;
    }
/*
    @Override
    public void receive(Packet packet) {
        if (this.getAddress().equals(packet.getDestinationAddress())){
            this.print(packet);
        }else{
            this.send(packet);
        }
    }
*/
    @Override
    public void handle(Packet packet) {
        System.out.println("The print "+this.getAddress()+ " printed your message "+ packet.getContents());
        printerStrategy.print(packet);
    }

/*
    public void print(Packet packet){
        System.out.println("The print "+this.getAddress()+ " printed your message "+ packet.getContents());
        printerStrategy.print(packet);
        }

*/

}


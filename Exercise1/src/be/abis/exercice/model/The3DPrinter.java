package be.abis.exercice.model;

public class The3DPrinter implements PrinterStrategy {

    @Override
    public void print(Packet packet) {
        System.out.println("Printed by the 3D Printer" );

    }
}

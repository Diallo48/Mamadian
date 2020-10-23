package be.abis.exercice.model;

public class LaserPrinter implements PrinterStrategy {
    @Override
    public void print(Packet packet) {
        System.out.println("Printed by laser Printer" );

    }
}

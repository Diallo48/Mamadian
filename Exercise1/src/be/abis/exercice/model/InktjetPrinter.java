package be.abis.exercice.model;

public class InktjetPrinter implements PrinterStrategy {
    @Override
    public void print(Packet packet) {

        System.out.println("Printed by Inktjet Printer" );
    }
}

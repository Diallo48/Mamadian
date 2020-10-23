package be.abis.exercice.test;

import be.abis.exercice.model.*;

public class TestLan {
    public static void main(String[] args){
        String addressDestination = "mons";
        String addressDestination2 = "gent";
        PrinterStrategy printS1 = new The3DPrinter();
        PrinterStrategy printS2 = new InktjetPrinter();
        PrinterStrategy printS3 = new LaserPrinter();

        Packet p = new Packet(addressDestination, "test");
        Packet p1 = new Packet(addressDestination2, "test2");
        Packet p2 = new Packet(addressDestination, "test2");

        LanComponent w = new WorkStation("lille");
        LanComponent n1 =  new Node("gent");
        LanComponent ps1 = new PrintServer("gent", printS1);
        LanComponent n2 = new Node("gent");
        LanComponent ps2 = new PrintServer("mons", printS2);
        w.setNextComponent(n1);
        n1.setNextComponent(ps1);
        ps1.setNextComponent(n2);
        n2.setNextComponent(ps2);
        ps2.setNextComponent(w);

        ((WorkStation) w).originate(p);
        ((WorkStation) w).originate(p1);










    }
}

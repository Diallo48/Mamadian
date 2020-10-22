package be.abis.exercice.test;

import be.abis.exercice.model.*;

public class TestLan {
    public static void main(String[] args){
        String addressDestination = "mons";
        Packet p = new Packet(addressDestination, "test");

        LanComponent w = new WorkStation("lille");
        LanComponent n1 =  new Node("gent");
        LanComponent p1 = new PrintServer("gent");
        LanComponent n2 = new Node("gent");
        LanComponent p2 = new PrintServer("mons");
        w.setNextComponent(n1);
        n1.setNextComponent(p1);
        p1.setNextComponent(n2);
        n2.setNextComponent(p2);
        p2.setNextComponent(w);








    }
}

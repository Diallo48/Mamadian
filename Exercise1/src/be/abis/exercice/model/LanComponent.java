package be.abis.exercice.model;

public abstract class LanComponent {
    private String address;
    private LanComponent nextComponent;

    // constructor
    public LanComponent(String address) {
        this.address = address;
    }

    // getter and setter

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LanComponent getNextComponent() {
        return nextComponent;
    }

    public void setNextComponent(LanComponent nextComponent) {
        this.nextComponent = nextComponent;
    }

    // method must be abstract

    public abstract void send(Packet packet);
    public abstract  void receive(Packet packet);

}

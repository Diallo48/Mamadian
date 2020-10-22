package be.abis.exercice.model;

public abstract class LanComponent {
    private String adress;
    private LanComponent nextComponent;


    public LanComponent(String adress) {
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public LanComponent getNextComponent() {
        return nextComponent;
    }

    public void setNextComponent(LanComponent nextComponent) {
        this.nextComponent = nextComponent;
    }

    public abstract void send(Packet packet);
    public abstract  void received(Packet packet);

    @Override
    public String toString() {
        return "LanComponent{" +
                "adress='" + adress + '\'' +
                ", nextComponent=" + nextComponent +
                '}';
    }
}

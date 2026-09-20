package factorymethod;

public abstract class Barracks {
    protected abstract Troop trainTroop();

    public void sendToWar(){
        Troop troop = trainTroop();

        troop.attack();
    }
}

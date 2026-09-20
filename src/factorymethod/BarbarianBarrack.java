package factorymethod;

public class BarbarianBarrack extends Barracks{
    @Override
    protected Troop trainTroop(){
        return new Barbarian();
    }
}

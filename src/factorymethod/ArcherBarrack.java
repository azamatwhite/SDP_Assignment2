package factorymethod;

public class ArcherBarrack extends Barracks{
    @Override
    protected Troop trainTroop(){
        return new Archer();
    }
}

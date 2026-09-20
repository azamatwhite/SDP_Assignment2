package abstractfactory;

public class Location {
    private final Defence defence;
    private final Champion champion;
    private final Terrain terrain;

    public Location(LocationFactory factory){
        this.defence = factory.createDefence();
        this.champion = factory.createChampion();
        this.terrain = factory.createTerrain();
    }

    public void visit(){
        terrain.describeTerrain();
        champion.useAbility();
        defence.defend();
    }
}

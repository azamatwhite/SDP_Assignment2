package abstractfactory.clancapital;

import abstractfactory.Terrain;

public class ClanCapitalTerrain implements Terrain {
    @Override
    public void describeTerrain(){
        System.out.println("This is a giant mountain with many levels. It feels very ancient.");
    }
}

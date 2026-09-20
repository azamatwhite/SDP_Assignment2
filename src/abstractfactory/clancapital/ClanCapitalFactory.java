package abstractfactory.clancapital;

import abstractfactory.Champion;
import abstractfactory.Defence;
import abstractfactory.LocationFactory;
import abstractfactory.Terrain;


public class ClanCapitalFactory implements LocationFactory {

    @Override
    public Champion createChampion(){
        return new ClanCapitalChampion();
    }

    @Override
    public Defence createDefence(){
        return new ClanCapitalDefence();
    }

    @Override
    public Terrain createTerrain(){
        return new ClanCapitalTerrain();
    }
}

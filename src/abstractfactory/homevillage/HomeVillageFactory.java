package abstractfactory.homevillage;

import abstractfactory.Champion;
import abstractfactory.Defence;
import abstractfactory.LocationFactory;
import abstractfactory.Terrain;


public class HomeVillageFactory implements LocationFactory {
    @Override
    public Champion createChampion(){
        return new HomeVillageChampion();
    }

    @Override
    public Defence createDefence(){
        return new HomeVillageDefence();
    }

    @Override
    public Terrain createTerrain(){
        return new HomeVillageTerrain();
    }
}

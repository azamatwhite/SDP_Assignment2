package abstractfactory.builderbase;

import abstractfactory.Champion;
import abstractfactory.Defence;
import abstractfactory.LocationFactory;
import abstractfactory.Terrain;

public class BuilderBaseFactory implements LocationFactory {

    @Override
    public Champion createChampion(){
        return new BuilderBaseChampion();
    }

    @Override
    public Defence createDefence(){
        return new BuilderBaseDefence();
    }

    @Override
    public Terrain createTerrain(){
        return new BuilderBaseTerrain();
    }

}

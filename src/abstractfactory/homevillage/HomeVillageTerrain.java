package abstractfactory.homevillage;

import abstractfactory.Terrain;

public class HomeVillageTerrain implements Terrain {
    @Override
    public void describeTerrain(){
        System.out.println("This place is warm and peaceful. It looks like a bright green forest where villagers can live safely.");
    }
}

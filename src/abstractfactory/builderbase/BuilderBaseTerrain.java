package abstractfactory.builderbase;

import abstractfactory.Terrain;

public class BuilderBaseTerrain implements Terrain {
    @Override
    public void describeTerrain(){
        System.out.println("This is a secret island at night. It has bright lights and loud machines.");
    }
}

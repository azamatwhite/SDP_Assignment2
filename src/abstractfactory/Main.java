package abstractfactory;

import abstractfactory.homevillage.HomeVillageFactory;

public class Main {
    public static void main(String[] args){

        LocationFactory factory = new HomeVillageFactory();

        Location location = new Location(factory);
        location.visit();


    }
}

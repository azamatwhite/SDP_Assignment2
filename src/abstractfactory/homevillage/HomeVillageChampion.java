package abstractfactory.homevillage;

import abstractfactory.Champion;

public class HomeVillageChampion implements Champion {

    @Override
    public void useAbility(){
        System.out.println("The Archer Queen goes invisible and spawns archers to help her.");
    }
}

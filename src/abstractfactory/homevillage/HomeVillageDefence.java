package abstractfactory.homevillage;

import abstractfactory.Defence;

public class HomeVillageDefence implements Defence {
    @Override
    public void defend(){
        System.out.println("Cannon fires a heavy shell at the nearest ground troop.");
    }
}

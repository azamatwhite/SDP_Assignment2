package abstractfactory.clancapital;

import abstractfactory.Defence;

public class ClanCapitalDefence implements Defence {
    @Override
    public void defend(){
        System.out.println("Super Wizard Tower shoots chain-lighting attacks that damages nearby troops at once.");
    }
}

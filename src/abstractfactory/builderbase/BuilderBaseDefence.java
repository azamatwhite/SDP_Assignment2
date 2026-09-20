package abstractfactory.builderbase;

import abstractfactory.Defence;

public class BuilderBaseDefence implements Defence {
    @Override
    public void defend(){
        System.out.println("The Crusher smashes down, damaging every troop underneath.");
    }
}

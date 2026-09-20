package abstractfactory.builderbase;

import abstractfactory.Champion;

public class BuilderBaseChampion implements Champion {

    @Override
    public void useAbility(){
        System.out.println("The Battle Machine roars and gets faster and stronger.");
    }

}

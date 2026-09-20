package abstractfactory.clancapital;

import abstractfactory.Champion;

public class ClanCapitalChampion implements Champion {
    @Override
    public void useAbility(){
        System.out.println("Mountain Golem leads the attack on enemy bases, using its huge size and power to smash strong defenses.");
    }
}

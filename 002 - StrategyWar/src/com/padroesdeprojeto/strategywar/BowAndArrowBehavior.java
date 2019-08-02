package com.padroesdeprojeto.strategywar;

public class BowAndArrowBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("Você usa um Arco e Fecha.");
    }

}

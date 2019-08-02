package com.padroesdeprojeto.strategywar;

public class AxeBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("Você usa um Machado.");
    }

}

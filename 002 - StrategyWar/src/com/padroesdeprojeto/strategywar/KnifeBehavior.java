package com.padroesdeprojeto.strategywar;

public class KnifeBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("Voc� usa uma Faca.");
    }

}

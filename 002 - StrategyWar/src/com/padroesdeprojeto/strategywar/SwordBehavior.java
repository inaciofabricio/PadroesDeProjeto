package com.padroesdeprojeto.strategywar;

public class SwordBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("Você usa uma Espada.");
    }

}

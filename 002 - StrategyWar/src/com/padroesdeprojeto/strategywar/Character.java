package com.padroesdeprojeto.strategywar;

public abstract class Character {

	WeaponBehavior weaponBehavior;
    
    public Character(){
        
    }
    
    public abstract void display();
    
    public void fight(){
        weaponBehavior.useWeapon();
    }
}

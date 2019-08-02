package com.padroesdeprojeto.strategywar;

public class Troll extends Character{

    public Troll(){
        weaponBehavior = new AxeBehavior();
    }
    
    @Override
    public void display() {
        System.out.println("Eu sou um Troll!");
    }

}

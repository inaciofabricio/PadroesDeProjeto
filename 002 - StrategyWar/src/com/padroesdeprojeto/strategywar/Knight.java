package com.padroesdeprojeto.strategywar;

public class Knight extends Character{

    public Knight(){
        weaponBehavior = new SwordBehavior();
    }
    
    @Override
    public void display() {
        System.out.println("Eu sou um Cavaleiro!");
    }

}

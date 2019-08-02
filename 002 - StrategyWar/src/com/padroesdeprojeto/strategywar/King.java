package com.padroesdeprojeto.strategywar;

public class King extends Character{

    public King(){
        weaponBehavior = new BowAndArrowBehavior();
    }
        
    @Override
    public void display() {
        System.out.println("Eu sou um Rei!");
    }

}

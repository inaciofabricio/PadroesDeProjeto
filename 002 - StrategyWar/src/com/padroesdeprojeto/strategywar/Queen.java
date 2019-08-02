package com.padroesdeprojeto.strategywar;

public class Queen extends Character {

    public Queen(){
        weaponBehavior = new KnifeBehavior();
    }
    
    @Override
    public void display() {
        System.out.println("Eu sou uma Rainha!");
    }

}

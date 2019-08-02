package com.padroesdeprojeto.strategywar;

public class War {

	public static void main(String[] args) {
		
		Character queen = new Queen();
        
        queen.display();
        queen.fight();
        System.out.println();
        
        
        Character king = new King();
        
        king.display();
        king.fight();
        System.out.println();
        
        
        Character knight = new Knight();
        
        knight.display();
        knight.fight();
        System.out.println();
        
        
        Character troll = new Troll();
        
        troll.display();
        troll.fight();
        System.out.println();

	}

}

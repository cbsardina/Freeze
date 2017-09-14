package com.sardina;

public class Main {

    public static void main(String[] args) {
	// write your code here
        GamePiece myGamePiece = new GamePiece(5,9,false,"blue", "Chris");

            System.out.println("---------- VERIFY NOT FROZEN, THEN FREEZE ----------");
            System.out.println("positionX #1: " + myGamePiece.getPositionX());
            System.out.println("positionY #1: " + myGamePiece.getPositionY());
            System.out.println("isFrozen() #1: " + myGamePiece.isFrozen());
        myGamePiece.move(10, 20);
            System.out.println("verify .move X to 10: " + myGamePiece.getPositionX());
            System.out.println("verify .move Y to 20: " + myGamePiece.getPositionY());
        myGamePiece.freeze();

            System.out.println("----------------- VERIFY IS FROZEN ------------------");
            System.out.println("After .freeze(), isFrozen() #2: " + myGamePiece.isFrozen());
            System.out.println("Running myGamePiece.move(posX:50, posY:100)");
        myGamePiece.move(50, 100);
            System.out.println("Position X after ∆ to 50 #2: " + myGamePiece.getPositionX());
            System.out.println("Position Y after ∆ to 100 #2: " + myGamePiece.getPositionY());

            System.out.println("-------------VERIFY CAN UNFREEZE AND REPOSITION ----------------");
        myGamePiece.unfreeze();
            System.out.println("After .unfreeze(), isFrozen() #3: " + myGamePiece.isFrozen());
            System.out.println("Running myGamePiece.move(posX:1000, posY:5000)");
        myGamePiece.move(1000, 5000);
            System.out.println("Position X after ∆ to 1000 #3: " + myGamePiece.getPositionX());
            System.out.println("Position Y after ∆ to 5000 #3: " + myGamePiece.getPositionY());

    }
}

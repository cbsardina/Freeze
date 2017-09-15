package com.sardina;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

    // ENTER FIRST GAME PIECE POSITIONS
            System.out.println("Enter a number 0-100 for your X position: ");
        int positionX = scanner.nextInt();
            System.out.println("Enter a number 0-100 for your Y position: ");
        int positionY = scanner.nextInt();

    // SET UP PLAYER GAME PIECES
        GamePiece myGamePiece = new GamePiece(positionX, positionY,false,"blue", "Chris");

    // PRINT #1 POSITIONS AND WHETHER PIECE IS FROZEN
            System.out.println("Your positionX is #1: " + myGamePiece.getPositionX());
            System.out.println("Your positionY is #1: " + myGamePiece.getPositionY());
            System.out.println("Is your game piece frozen? " + myGamePiece.isFrozen());
            System.out.println(" ");

    // PLAYER ENTERS NEW POSITIONS FOR THE GAME PIECE
            System.out.println("Now move your game piece (number 0-100) in the X position: ");
        positionX = scanner.nextInt();
            System.out.println("Now move your other game piece (number 0-100) in the Y position: ");
        positionY = scanner.nextInt();
        myGamePiece.move(positionX, positionY);
            System.out.println("Your new positionX is #2: " + myGamePiece.getPositionX());
            System.out.println("Your new positionY is #2: " + myGamePiece.getPositionY());
            System.out.println("Good move, you avoided getting your game pieces frozen!");
            System.out.println(" ");

    // AFTER 2ND MOVE, GAME PIECES ARE FROZEN
        myGamePiece.freeze();

    // PLAYER IS PROMPTED TO MOVE PIECES A 3RD TIME
            System.out.println("Go ahead and move your X position again (number 0-100). ");
        positionX = scanner.nextInt();
            System.out.println("And once more for your Y position (number 0-100). ");
        positionY = scanner.nextInt();
        myGamePiece.move(positionX, positionY);
            System.out.println("Your positionX #3: " + myGamePiece.getPositionX());
            System.out.println("Your positionY #3: " + myGamePiece.getPositionY());
            System.out.println("Womp Womp! Your game piece has been frozen! Just a second and I'll unfreeze it for you...");
            System.out.println(" ");

    // UNFREEZE GAME PIECES
        myGamePiece.unfreeze();

    // ENTER POSITIONS ONE LAST TIME TO SHOW THAT THE PIECES ARE UNFROZEN
            System.out.println("Go ahead and enter a new X position from 0-100 now.");
        positionX = scanner.nextInt();
            System.out.println("And enter a new Y position from 0-100 also. ");
        positionY = scanner.nextInt();
            myGamePiece.move(positionX, positionY);
        System.out.println("Your new positionX is #4: " + myGamePiece.getPositionX());
        System.out.println("Your new positionY is #4: " + myGamePiece.getPositionY());

    }
}

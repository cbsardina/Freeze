package com.sardina;

public class GamePiece {

    int positionX;
    int positionY;
    boolean frozen;
    String color;
    String name;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public GamePiece(int positionX, int positionY, boolean frozen, String color, String name) {
        this.positionX = 0;
        this.positionY = 0;
        this.frozen = false;
        this.color = color;
        this.name = name;
    }

    public void move(int posX, int posY) {
        positionX = posX;
        positionY = posY;
    }

    public void freeze() {
        frozen = true;
    }

    public void unfreeze() {
        frozen = false;
    }
}



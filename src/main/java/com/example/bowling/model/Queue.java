package com.example.bowling.model;

public class Queue {

    private int firstThrowPoints;
    private int secondThrowPoints;
    private int sumOfPoints;


    public void addStrikeBonus(int bonus){
        this.sumOfPoints = this.sumOfPoints + bonus;
    }


}

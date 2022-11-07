package com.example.bowling.model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Player {

    private List<Queue> queueList;

    public Player() {
        this.queueList = new ArrayList<>(10);
    }

    public void addStrikeBonus() {
        queueList.add(10, new Queue());
        queueList.add(11, new Queue());
    }

    public void addSplitBonus() {
        queueList.add(10, new Queue());
    }

}

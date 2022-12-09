package com.fy.patterns.design.chapter13;

public class GumballMachine {

    private State noQuarterState;
    private State quarterState;
    private State soldState;
    private State winnerState;
    private State soldOutState;

    private int count = 2;
    private State currentState;

    public GumballMachine() {
        this.noQuarterState = new NoQuarterState(this);
        this.quarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);
        this.winnerState = new WinnerState(this);
        this.soldOutState = new SoldOutState();

        currentState = noQuarterState;
    }

    public void insertQuarter() {
        currentState.insertQuarter();
    }

    public void ejectQuarter() {
        currentState.ejectQuarter();
    }

    public void turnCrank() {
        currentState.turnCrank();
        currentState.dispense();
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getQuarterState() {
        return quarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public int getCount() {
        return count;
    }

    /**
     * 吐糖
     */
    public void release() {
        System.out.println("糖！来！了！");
        if (count > 0) {
            count -= 1;
        }
    }
}

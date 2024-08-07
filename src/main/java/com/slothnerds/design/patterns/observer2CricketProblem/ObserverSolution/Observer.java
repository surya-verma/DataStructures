package com.slothnerds.design.patterns.observer2CricketProblem.ObserverSolution;

// This interface is implemented by all those
// classes that are to be updated whenever there
// is an update from CricketData
interface Observer
{
    public void update(int runs, int wickets,
                       float overs);
}

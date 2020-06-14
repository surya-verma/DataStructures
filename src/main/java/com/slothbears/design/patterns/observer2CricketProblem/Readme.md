Let us first consider the following scenario to understand observer pattern.

Scenario:

Suppose we are building a cricket app that notifies viewers about the information such as current score, run rate etc. Suppose we have made two display elements CurrentScoreDisplay and AverageScoreDisplay. CricketData has all the data (runs, bowls etc.) and whenever data changes the display elements are notified with new data and they display the latest data accordingly.
![Image of Architecture](https://media.geeksforgeeks.org/wp-content/uploads/ObserverPatternSet-1.png)

Solution 1 --> Non Observer way 
NonObserverSolution.java

Problems with NonObserverSolution design:

1. CricketData holds references to concrete display element objects even though it needs to call only the update method of these objects. It has access to too much additional information than it requires.
2. This statement “currentScoreDisplay.update(runs,wickets,overs);” violates one of the most important design principle “Program to interfaces, not implementations.” as we are using concrete objects to share data rather than abstract interfaces.
3. CricketData and display elements are tightly coupled.
4. If in future another requirement comes in and we need another display element to be added we need to make changes to the non-varying part of our code(CricketData). This is definitely not a good design practice and application might not be able to handle changes and not easy to maintain.

Applying Observer pattern to above problem:
Let us see how we can improve the design of our application using observer pattern. If we observe the flow of data we can easily see that the CricketData and display elements follow subject-observers relationship.

New Class Diagram:
![Image of Architecture](https://media.geeksforgeeks.org/wp-content/uploads/ObserverPatternSet-2.png) 


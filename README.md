# RestaurantApp
Group project in 370.


# Architecture and Design Document #

## **Introduction**

The system architecture of this project involves five different components that do not interact with one another. Each component represents the conceptual implementation of one of five design patterns. Particularly, we represent the following design patterns: Factory, State, Decorator, Observer, and Singleton. The use of design patterns is beneficial because they are well-tested solutions to common problems and inherently ensure maintainability, performance, intelligibility of code, and efficiency. Of course, each particular design pattern has its tradeoffs; for example, what can typically be represented in a single class may require a large number of classes to implement as a design pattern, which may be a less efficient use of space. However, these downsides are considered reasonable tradeoffs compared to the benefits of readability, extensibility, and proper encapsulation. 

## **Architecture and Design Philosophy**

The key goals for our architecture is to provide adequate demonstration of five different design patterns as they apply to a restaurant application. For each of the five components, a design pattern was first selected and then studied in depth. Then, possible applications of this design pattern to a restaurant setting were considered; the one that best represented the capabilities of the design pattern was then chosen and implemented in a restaurant-specific way. As it happens, many design patterns naturally fit well into the business of a restaurant, because a restaurant has so many different functionalities it undergoes. For example, sending orders to the kitchen electronically works perfectly with the Factory Design Pattern; the Singleton Design Pattern, meanwhile, ensures only one instance, stopwatch in our case, is created and not multiple stopwatches for a single customer; the State Design Pattern helps categorize the current state of each customer and ensures any actions they can possibly take are well-accounted for; and so on.

An alternative consideration for the architecture of the project at first was to connect all the five design patterns into one fully functional application that seamlessly transitions from the use of one pattern to another, perhaps even using multiple patterns for a single operation. However, this was ultimately decided against, as it was not feasible within the given time frame. Furthermore, the use of discrete components, each of which properly and completely demonstrates a single design pattern in a vacuum, helped clearly outline an understanding of particular design patterns without complicating the matter and muddying the implementation and benefits of each.

The system is designed to be highly extensible for future use, whether due to modification of restaurant practices and information or due to heavier user and system load. The design patterns we chose are naturally suited to modification, and further decisions were taken in order to ensure even more safeguards. For example, the State Design Pattern, which represents each Patron as a single Context, is purposefully implemented with Singleton States, so that each additional customer does not require the instantiation of seven brand new states, but rather shares in the existing ones. This decision and others like it were taken to ensure the potential for growth in many possible directions.


# Process View
## **Design Models**


### **State Design Pattern. UML Diagram:**
![Copy of UML - State Pattern](https://user-images.githubusercontent.com/69221395/129102457-1845b925-e8d6-4b7c-ab1b-c1d4bf6eb18c.jpg)
![State Diagram - State Pattern](https://user-images.githubusercontent.com/69221395/129102945-9cf516ba-23c3-4aa8-84db-b394a5bd64ab.jpg)




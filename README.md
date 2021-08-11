# RestaurantApp
Group project in 370.

# Requirements Document

## 1.0 Introduction

## 1.1 Purpose of Document
Molly’s Restaurant Hub is an application designed to service the employees and patrons of Molly’s Restaurant, a high-end and well-frequented establishment that has been losing customers due to a lack of organization and slow wait times. The application is designed to create a more streamlined work environment for the employees of Molly’s Restaurant so that less mistakes are possible and that more effort goes towards customer service, and to allow customers to have a more seamless experience every step of the way, from placing reservations to tipping at the end of the night. This document outlines project scope, objectives, and requirements (functional and non-functional) and provides a route to implementation.

## 1.2 Project Summary
**Project Name:** Molly’s Restaurant Hub (MRH)

**Project Manager:** Benjamin Kluger, CEO of 370 Inc.

**Project Analysts:** 
- Kieun Bae, Analyst
- Eyal Dalal, Analyst
- Syed Hasib, Analyst
- Momina Mim, Analyst
- Mohab Taha, Analyst

**Responsible Users:** Aryeh Greenberg, CEO of Molly’s Restaurant

## 1.3 Background 
Molly’s Restaurant is a world-renowned, three Michelin star restaurant with its main location in Times Square, NYC. It has four more locations situated in other major US cities. Its typical clientele consists of wealthy tourists and natives looking for a high-end culinary experience complete with irreproachable service. Recent polls and focus groups have noted a marked decline in customer satisfaction, which is putting the restaurant’s reputation on the line. An emergency meeting of shareholders has determined that the fundamental structure of the dining experience for customers must be changed at once, and that the systems utilized by employees must be modernized. Molly’s Restaurant has been around since the 20th century and has not kept up with the times; reservations are handled by phone, on-duty managers have to utilize a physical keycard to issue refunds, and the kitchen receives illegible handwritten orders, to name just a few issues. 

As such, Aryeh Greenberg, the new CEO of Molly’s Restaurant, has taken the executive decision to rework the entire system from the ground up, and center it on a mobile application to be utilized on both ends—both from the consumer side and the business’ side. The application should allow the restaurant to continue providing the stable, reliable, high-end experience for which it is known.

## 1.4 Project Scope
The scope of this project is a mobile-based application to be utilized by customers and employees (including hosts, servers, and kitchen staff). Limited functionality is available via a web-based application for those customers who do not wish to download the fully functional application. 

The existing website will be replaced by the new web application. The phoneline-based reservation system will be discontinued in favor of the modernized approach. 

Not included in this project is the exact implementation of the web application—that part will need to be extrapolated from the mobile application after its completion, as a separate project.

## 1.5 System Purpose
**Users:** 

Those who will primarily benefit from the new system and those who will be affected by the new system include

**Customers:**
	
Upon implementation of the new system, customers will find app navigation, product identification (which meal they want) and product ordering easier. Customers will be able to choose what toppings they want as well.

**Hosts:**

The hosts will have the ability to view their customer’s orders as well as their position in the ordering process.

**Wait Staff:**

Wait staff will not be spread so thin, as customers will now have the option to order via application as well. Sending orders to the kitchen will also become a more streamlined operation in which less errors will arise. 

**Kitchen Staff:**

The new system should reduce the workload of the kitchen staff as kitchen staff members are able to find the information they need from the application. The staff will be better able to send out their dishes on time, accordingly. 

**Shareholders:**

Shareholders will benefit from reduced expenditures and losses.



## 1.6 Definitions and Acronyms
**MRH:**

Molly’s Restaurant Hub; the mobile application being developed.

**Molly’s Restaurant:**

The client.

**Design Patterns:**

A repeatable formalization that solves a particular problem encountered in the process of software engineering, operating as easily communicable and implementable templates in the process of application or system design. They offer a variety of benefits, from ease of extensibility to better adherence of Object Oriented Principles.

**UI:**

User Interface—the layout of visual elements with which a user interacts during system use.

**UX:**

User Experience—the experience a person has as they navigate a particular system; as opposed to the UI, the UX is more of a subjective measure. A good UI does not necessarily ensure a good UX, and a sparse UI does not necessarily lead to a bad UX, though surely the two are linked.

**Factory Design Pattern:**

The Factory design pattern is relatively simple. The developer creates an interface or abstract class for creating an object, but lets the subclasses (that inherit from that object) decide which class to instantiate. 
To explain, you’d use the factory pattern when you want a method to return one of several possible classes that share a common superclass. Say you are making a game, and you want a random enemy to pop up on the screen. How would you do this? You’d create a random number generator, and each potential enemy class is assigned one of the numbers that could pop out of that random number generator. I can then send that number to the factory object, and it will return to me a dynamically created enemy and throw it on the screen. The whole point is that we want the ability to have classes chosen at runtime, and that’s what the factory pattern provides for us.
So when would you use the factory pattern? When you don’t know ahead of time what you might need (make sure that all the potential classes are of the same subclass hierarchy). Looking at the UML diagram for this pattern, you can see that we look in the main() method for the user to ask the DishFactory class to create a specific dish for them (appetizer, entrée, or dessert). Using the getDish() method, the DishFactory creates one of those three options. Those three subclasses implement the superclass of Dish, which contains a makeTheFood() method. Therefore, when the DishFactory class creates one of the three Dish subclasses, they call the makeTheFood() method as well.

**State Design Pattern:**

The State Design Pattern consists of a Context (the thing that exists in one of several States) and a set of States (the situation a Context is currently in). It allows for a class instance to delegate its actions to its current State so that it operates exactly as it should at any particular point of its lifecycle. In other words, the same instance taking the same action while in different States would lead to different results, because the actual implementation of the action occurs within the State. In this system, the Context is the Patron class, which is any customer engaged in an interaction with the restaurant. Patrons can exist in one of seven States at a time depending on what stage of their dining experience they are currently in. This allows for each Patron to be treated the same way, and grants each Patron the same range of actions; however, depending on the particular state a Patron is in, the results of that action may be entirely different.
	
**Observer Design Pattern:** 

Observer pattern is a popular behavioral design pattern that is often used to define a one to many dependency/relationship. The object known as the “subject” will maintain a list of “observers” which are the dependents. It is very similar in aspects to the Publisher-Subscriber pattern. When one object changes its “state,” all other objects will be notified of the change. In this particular case, the user is waiting for their entree, appetizer or dessert. The FoodSubject interface will check the status of the order from the Observer interface then notify the user. The Observer will update on the order and all the dependents (appetizer, dessert and entree) will change based upon what update it will give.

**Decorator Design Pattern:** 

The decorator pattern allows an existing object to receive new functionality without having to alter its structure. This is more efficient than using subclasses, because the behavior of an object can be expanded without having to define a new object. In the classes within Dishes and Toppings, the decorator pattern allows methods to be shared from the ThaiDish class. This also allows a Dish to be decorated with multiple Toppings if needed. The cost of the Dish and the Toppings are then calculated using inheritance. 

**Singleton Design Pattern:**

The singleton design pattern restricts instantiation of the class to only one instance or object while providing global access to it. It means once an object is created, that’s the only object. Any attempts to create another object will return the original object. It is used for things like logging, database connection, drivers objects, etc. In this project, it will be used to make a stopwatch that will show the time from an order is placed to when the order is ready to be served. 

## 1.7 Software Specification

The system will be implemented as a five-branched program wherein a user selects one of five sub-systems, each implemented using a different design pattern. Object oriented principles will be utilized, and discrete classes will be written to exist in as decoupled a manner as possible. It will be coded using Java. 

The main class will contain a main method, in which the original choice of design pattern to be demonstrated is made through a GUI popup. Each design pattern will be represented as an option, and will have corresponding driver code within the main method that demonstrates the capabilities of that particular pattern in the context of a restaurant application. The demonstrations will be printed in the console and may require user interaction if it benefits the demonstration. 

After the demonstration is completed, a thank you screen is output to the console and the program terminates. To view another design pattern in action, the program must be restarted. The code is written in such a way that future decisions to integrate the various components of the system will be possible, although that remains for a project of larger scope than the current one.

## 2.0 Functional Objectives

1. The system shall restructure order input so that all orders are filtered by a particular dish type. This will organize the ordering process and ensure consistency across the restaurant’s locations and between each order. Incorrect output from the kitchen will be reduced by 20%.
2. The system shall allow for reservations by mobile application. This will simplify the reservation process and will encourage repeat customers to download the mobile application, increasing brand loyalty. Customer retention rate will rise by 15% and time needed to place a reservation will be cut in half.
3. The system shall automatically catch and ban patrons who leave without paying. This will disincentivize dining and dashing and will provide employees more time to better serve their customers. Preventable losses will be reduced by 30%. Employee and customer satisfaction will both rate higher.
4. The system shall allow ordering and payment via application. This will allow for a speedier experience for those customers who choose to utilize this option. Customer wait times will be reduced by 60%. Customer turnaround will be increased by 30%.
5. The system will allow faster processing of orders to the kitchen staff due to status updates of the meals being made. The user will be able to see the progress of their orders and see when the dish request is received by the restaurant and is ready to be served, and the waiters will know when and where to deliver the dish.
6. The system displays the time since the order was made on a screen for the kitchen staff to use, so they have a time frame and can prepare the order as quickly as possible to reduce the wait time between an order being placed and being ready. This will lead to an increase in customer satisfaction rate. 
7. The system will allow for more customization of entrees ordered through the app, leading to more versatility in what is offered to the customer.

















# Architecture and Design Document #

## **Introduction**

The system architecture of this project involves five different components that do not interact with one another. Each component represents the conceptual implementation of one of five design patterns. Particularly, we represent the following design patterns: Factory, State, Decorator, Observer, and Singleton. The use of design patterns is beneficial because they are well-tested solutions to common problems and inherently ensure maintainability, performance, intelligibility of code, and efficiency. Of course, each particular design pattern has its tradeoffs; for example, what can typically be represented in a single class may require a large number of classes to implement as a design pattern, which may be a less efficient use of space. However, these downsides are considered reasonable tradeoffs compared to the benefits of readability, extensibility, and proper encapsulation. 

## **Architecture and Design Philosophy**

The key goals for our architecture is to provide adequate demonstration of five different design patterns as they apply to a restaurant application. For each of the five components, a design pattern was first selected and then studied in depth. Then, possible applications of this design pattern to a restaurant setting were considered; the one that best represented the capabilities of the design pattern was then chosen and implemented in a restaurant-specific way. As it happens, many design patterns naturally fit well into the business of a restaurant, because a restaurant has so many different functionalities it undergoes. For example, sending orders to the kitchen electronically works perfectly with the Factory Design Pattern; the Singleton Design Pattern, meanwhile, ensures only one instance, stopwatch in our case, is created and not multiple stopwatches for a single customer; the State Design Pattern helps categorize the current state of each customer and ensures any actions they can possibly take are well-accounted for; and so on.

An alternative consideration for the architecture of the project at first was to connect all the five design patterns into one fully functional application that seamlessly transitions from the use of one pattern to another, perhaps even using multiple patterns for a single operation. However, this was ultimately decided against, as it was not feasible within the given time frame. Furthermore, the use of discrete components, each of which properly and completely demonstrates a single design pattern in a vacuum, helped clearly outline an understanding of particular design patterns without complicating the matter and muddying the implementation and benefits of each.

The system is designed to be highly extensible for future use, whether due to modification of restaurant practices and information or due to heavier user and system load. The design patterns we chose are naturally suited to modification, and further decisions were taken in order to ensure even more safeguards. For example, the State Design Pattern, which represents each Patron as a single Context, is purposefully implemented with Singleton States, so that each additional customer does not require the instantiation of seven brand new states, but rather shares in the existing ones. This decision and others like it were taken to ensure the potential for growth in many possible directions.


# Process View: Design Models

## State Design Pattern
![Copy of UML - State Pattern](https://user-images.githubusercontent.com/69221395/129102457-1845b925-e8d6-4b7c-ab1b-c1d4bf6eb18c.jpg)
![State Diagram - State Pattern](https://user-images.githubusercontent.com/69221395/129102945-9cf516ba-23c3-4aa8-84db-b394a5bd64ab.jpg)


## Factory Design Pattern
![UML Diagram Factory](https://user-images.githubusercontent.com/69221395/129103113-8d2dac34-33bc-491d-bd67-3e88f1f4d1d2.png)

## Decorator Design Pattern
<img width="920" alt="Decorator UML" src="https://user-images.githubusercontent.com/69221395/129103157-2af5e29a-9f37-4514-a577-7cb7ceb9f373.png">

## Observer Design Pattern
<img width="946" alt="Observer UML Diagram" src="https://user-images.githubusercontent.com/69221395/129103340-3269ac23-bda8-48da-a28e-2a71e4c6391d.png">

## Singleton Design Pattern
![Singleton Pattern UML Diagram](https://user-images.githubusercontent.com/69221395/129103372-5da1dff1-a619-42aa-b73c-0a3afc559b61.png)




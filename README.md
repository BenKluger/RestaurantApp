# RestaurantApp
Group project in 370

# Requirements Document

## 1.0 Introduction

## 1.1 Purpose of Document
Molly’s Restaurant Hub is an application designed to service the employees and patrons of Molly’s Restaurant, a high-end and well-frequented establishment that has been losing customers due to a lack of organization and slow wait times. The application is designed to create a more streamlined work environment for employees of Molly’s Restaurant so that less mistakes are possible and that more effort goes towards customer service, and to allow customers to have a more seamless experience every step of the way, from placing reservations to tipping at the end of the night. This document outlines project scope, objectives, and requirements (functional and non-functional) and provides a route to implementation.

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

## 3.0 Non-Functional Objectives:

## 3.1 Security

- The system shall properly protect all sensitive user information including, but not limited to, credit card information, address, username and password.
- Location data shall be utilized only to determine whether a customer is in one of two states: “In Restaurant” and “Away”. Specific user location will never be logged unless utilized for delivery.
- All data shall be encrypted.
- Users who create accounts will have the following password restrictions: 10-character minimum, use of at least one capital and one lowercase letter, use of at least one symbol, and use of at least one number.

## 3.2 Performance

- The system shall support 3000 simultaneous users (combined max capacities across all five locations multiplied by 5—this provides adequate leeway for “Away” state customers simply placing orders and future reservations through the application).
- “Support” is defined as delivering on functionalities within 5 seconds of an interaction in the worst case.

## 3.3 Reliability

- The system shall be completely operational at least 95% of the time.
- Down time after a failure shall not exceed 1 hour.

## 3.4 Supportability

- The system shall be able to accommodate changes to the menu without major reengineering.
- The mobile application shall be easily translatable to a limited-functionality web application.

## 3.5 Usability

- The system shall have an easily navigable UI and promote a simple, friendly, and intuitive UX.
- There should be absolutely no learning curve necessary. This will be achieved by utilizing similar design standards and visual cues as those used by other modern applications. 
- App Store ratings must remain at 4 stars or above; if dipping below this benchmark, the UI must be reworked.

## 3.6 Interfaces

The system must interface with: 
- The current accounting system utilized by Molly’s Restaurant.
- The current employee management system utilized by Molly’s Restaurant.
- UberEats and DoorDash, where available.

## 4.0 Assumptions, Dependancies, and Constraints:

## 4.1 Assumptions

- All team members will be readily reachable and are capable of completing their delegated tasks in a timely manner.
- Budget will be no issue, as the costs of development are nonexistent for this project.
- The given deadline of August 11, 2021 is an achievable one.
- The use of tools such as GitHub, Discord, and Google Docs will create an efficient and collaborative environment, such that remote group work will not be an issue.

## 4.2 Dependencies 

- Each of the five design patterns has an end-to-start dependency relationship with its corresponding driver code in the main class (that is, the driver code cannot be meaningfully written until the design pattern it tests is completed).
- The main class has an end-to-end dependency relationship with the rest of the code, i.e., the implementation of the five design patterns (that is, the main class can be partially created prior to the completion of all five design patterns, but it cannot be completed until the rest of the code is finished).
- The implementation of the JUnit tests has an end-to-end relationship with the corresponding tested classes (that is, though the coding of the tests can be done beforehand, as in TDD, it cannot be meaningfully completed until the exact classes under scrutiny are implemented and their method signatures are known; furthermore, the code will not compile before this point).

## 4.3 Constraints

- Project must be completed by August 11, 2021.
- Group work must be conducted remotely utilizing tools such as GitHub, Discord, and Google Docs.
- In-depth documentation including UML diagrams are required for each of the five design patterns.
- All code must properly showcase a design pattern while relating to the context of a restaurant.

## 5.0 The Context Model:
## 5.1 Context Diagram

![ContextDiagram](https://user-images.githubusercontent.com/69221395/129106889-fd611559-89d6-4537-b41f-f00954da3c56.png)


## 5.2 System Externals

**UberEats/DoorDash/Seamless:**

Delivery apps for the customers to order remotely. Work related to such orders is not dealt within Molly’s Restaurant Hub, but is handed off to these services.

**Square:**

Cashier system that seamlessly integrates the customer’s billing with the restaurant’s system.

**Accounting System:**

All financial transactions of the restaurant will be carefully tracked to ensure the best possible outcome and customer experience. The system will analyze every processed balance, accounts receivable/payable, sales, etc.

**Employee management system:**

This system will keep track of the check in/check out information of the employees.

**Customers:**

The customers interact directly with the restaurant system. They make use of the delivery apps and/or the Square cashier system to purchase their product.

## 6.0 The Use Case Model

![image](https://user-images.githubusercontent.com/69221395/129107624-fcc5c642-95ff-421e-8ca0-ffa01181aca4.png)

![image](https://user-images.githubusercontent.com/69221395/129107783-59f29320-76cf-47dd-af43-72e3f2563bba.png)

![image](https://user-images.githubusercontent.com/69221395/129107709-01620a85-8761-4720-bdd4-d352083a9831.png)

![image](https://user-images.githubusercontent.com/69221395/129107811-ae310aa6-94af-44aa-803d-bd6711b6ab88.png)

## 7.0 Platform Requirements Specification

- The application should function on all up-to-date iOS and Android mobile devices. 
- Internet service is required to connect to the restaurant server, which will be set up as well.
- Integration into the current firmware of the restaurant’s Point of Sale (POS) software will also be required, and if this proves to be untenable, the POS software will need to be updated to a compatible version as well. 
- Necessary languages include Java and Swift. 
- Extending the application to a limited web application format is a project that will be undertaken in the future, and this will require the use of JavaScript.















# Architecture and Design Document #

## 1.0 Introduction

The system architecture of this project involves five different components that do not interact with one another. Each component represents the conceptual implementation of one of five design patterns. Particularly, we represent the following design patterns: Factory, State, Decorator, Observer, and Singleton. The use of design patterns is beneficial because they are well-tested solutions to common problems and inherently ensure maintainability, performance, intelligibility of code, and efficiency. Of course, each particular design pattern has its tradeoffs; for example, what can typically be represented in a single class may require a large number of classes to implement as a design pattern, which may be a less efficient use of space. However, these downsides are considered reasonable tradeoffs compared to the benefits of readability, extensibility, and proper encapsulation. 

## 2.0 Architecture and Design Philosophy

The key goals for our architecture is to provide adequate demonstration of five different design patterns as they apply to a restaurant application. For each of the five components, a design pattern was first selected and then studied in depth. Then, possible applications of this design pattern to a restaurant setting were considered; the one that best represented the capabilities of the design pattern was then chosen and implemented in a restaurant-specific way. As it happens, many design patterns naturally fit well into the business of a restaurant, because a restaurant has so many different functionalities it undergoes. For example, sending orders to the kitchen electronically works perfectly with the Factory Design Pattern; the Singleton Design Pattern, meanwhile, ensures only one instance, stopwatch in our case, is created and not multiple stopwatches for a single customer; the State Design Pattern helps categorize the current state of each customer and ensures any actions they can possibly take are well-accounted for; and so on.

An alternative consideration for the architecture of the project at first was to connect all the five design patterns into one fully functional application that seamlessly transitions from the use of one pattern to another, perhaps even using multiple patterns for a single operation. However, this was ultimately decided against, as it was not feasible within the given time frame. Furthermore, the use of discrete components, each of which properly and completely demonstrates a single design pattern in a vacuum, helped clearly outline an understanding of particular design patterns without complicating the matter and muddying the implementation and benefits of each.

The system is designed to be highly extensible for future use, whether due to modification of restaurant practices and information or due to heavier user and system load. The design patterns we chose are naturally suited to modification, and further decisions were taken in order to ensure even more safeguards. For example, the State Design Pattern, which represents each Patron as a single Context, is purposefully implemented with Singleton States, so that each additional customer does not require the instantiation of seven brand new states, but rather shares in the existing ones. This decision and others like it were taken to ensure the potential for growth in many possible directions.


## 3.0 Process View
![Process View Diagram](https://user-images.githubusercontent.com/69221395/129106428-c605826b-eb11-41db-9a72-3ac683b5c617.jpg)



## 4.0 Design Models:

## 4.1 State Design Pattern
![Copy of UML - State Pattern](https://user-images.githubusercontent.com/69221395/129102457-1845b925-e8d6-4b7c-ab1b-c1d4bf6eb18c.jpg)
![State Diagram - State Pattern](https://user-images.githubusercontent.com/69221395/129102945-9cf516ba-23c3-4aa8-84db-b394a5bd64ab.jpg)

## 4.2 Factory Design Pattern
![UML Diagram Factory](https://user-images.githubusercontent.com/69221395/129103113-8d2dac34-33bc-491d-bd67-3e88f1f4d1d2.png)

## 4.3 Decorator Design Pattern
<img width="920" alt="Decorator UML" src="https://user-images.githubusercontent.com/69221395/129103157-2af5e29a-9f37-4514-a577-7cb7ceb9f373.png">

## 4.4 Observer Design Pattern
<img width="946" alt="Observer UML Diagram" src="https://user-images.githubusercontent.com/69221395/129103340-3269ac23-bda8-48da-a28e-2a71e4c6391d.png">

## 4.5 Singleton Design Pattern
![Singleton Pattern UML Diagram](https://user-images.githubusercontent.com/69221395/129103372-5da1dff1-a619-42aa-b73c-0a3afc559b61.png)


# Testing Document

*For each design pattern, a central class was selected in which two methods were tested, once with expected input and once with unexpected (“bad”) input. All tests passed. Both good and bad input passed where applicable; otherwise, unit was simply tested for correctness.

## 1.0 Design Patterns
## 1.1 State Design Pattern
*See file PatronTest.java for implementation.*

**Details:**

- Conducted unit test on makeReservation() method. Test passed.
	- makeReservation() was run for a Patron in NoReservationState. Correct State transition to MadeReservationState was observed.
	- makeReservation() was run for a Patron in SeatedState - an improper action for a Patron to take, given they are already seated. No State transitions were undertaken, demonstrating proper functioning under bad input.

- Conducted unit test on placeOrder() method. Test passed.
	- placeOrder(double price) was run on a positive price. Balance was observed to adjust accordingly.
	- placeOrder(double price) was run on a negative price. Balance was observed to remain unchanged (no menu items are negatively priced).

## 1.2 Factory Design Pattern
*See file DishFactoryTest.java for implementation.*

**Details:**

- Conducted unit test on getDish() method. Test passed.
	- A new DishFactory object was created, and called the getDish() method while passing in “Appetizer” as a parameter. This was tested as a boolean (assuming true) to see if it was an instance of the Appetizer class. Test Passed, meaning that it is an instance of the Appetizer class.
	- A new DishFactory object was created, and called the getDish() method while passing in “Appetizer” as a parameter. This was tested as a boolean to see if it was an instance of the Dessert class. Test Passed, meaning that it is NOT an instance of the Appetizer class.

## 1.3 Decorator Design Pattern
*See file ToppingDecoratorTest.java for implementation.*

**Details:**

- Conducted unit test on price() method. Test passed.
	- A new PadThai dish is created and assertEquals is used to check if the int for the price of the dish matches the expected value.
- Conducted unit test on getItemName() method. Test passed.
	- A new PadThai dish is created and assertEquals is used to check if the string for the name of the dish matches the expected string.

## 1.4 Observer Design Pattern
*See file foodMessageTest for implementation.*

**Details:**

- Conducted unit test on getMessageContent() method. Test passed.
	- assertEquals will check if the string input is correct for the message by seeing if they match. 

- Conducted unit test on foodMessage() method. Test passed.
	- assertEquals will check if the string input is correct for the message by seeing if they match for the fOrder.

## 1.5 Singleton Design Pattern
*See file SingletonTests for implementation.*

**Details:**

- Conducted unit test on Stopwatch method. Test passed.
	- Good input: assertSame(StopwatchObject1, StopwatchObject 2); two singleton objects must be point to the same object because they have global access to a single instance
	- Bad input: assertNotSame(Customer1, Customer2); they are not singleton objects
- Conducted unit test on getTime method. Test passed.
	- Expected time (0m:0s) shouldn’t equals to what getTime() returns because from the time is initialized it continues running 

## 2.0 Component Tests

*Each of the following component tests demonstrates proper operation of an entire design pattern when a user (or a system-simulated user) performs a particular action.*

## 2.1 State Design Pattern
A Patron presses “Place Order” on their application. The exact action is delegated to the Patron’s current State and the application behaves appropriately as pertains to this particular Patron.

## 2.2 Factory Design Pattern
A dish order is created among the three options (appetizer, entree, or dessert), and the correct dish is created for the customer according to their specifications.

## 2.3 Decorator Design Pattern
Once a user selects an entree from the six dishes available, they are asked to select the topping of their choice, and the total cost is calculated for their selection. 

## 2.4 Observer Design Pattern
After an order is made, it will be sent to the appetizer, entree and dessert sections then the user is notified that their order has been received by the restaurant. The meal statuses will be updated when it will be ready to serve.

## 2.5 Singleton Design Pattern
Once a customer places an order, the stopwatch starts ticking until the order is ready to be served. It displays the time elapsed between the order placed by the customer and prepared by the chef. 




Thank you for checking out our project!

# RestaurantApp
Group project in 370.

# Requirements Document

## 1 Introduction

###### 1.1 Purpose of Document
Molly’s Restaurant Hub is an application designed to service the employees and patrons of Molly’s Restaurant, a high-end and well-frequented establishment that has been losing customers due to a lack of organization and slow wait times. The application is designed to create a more streamlined work environment for the employees of Molly’s Restaurant so that less mistakes are possible and that more effort goes towards customer service, and to allow customers to have a more seamless experience every step of the way, from placing reservations to tipping at the end of the night. This document outlines project scope, objectives, and requirements (functional and non-functional) and provides a route to implementation.

###### 1.2 Project Summary
**Project Name:** Molly’s Restaurant Hub (MRH)

**Project Manager:** Benjamin Kluger, CEO of 370 Inc.

**Project Analysts:** 
- Kieun Bae, Analyst
- Eyal Dalal, Analyst
- Syed Hasib, Analyst
- Momina Mim, Analyst
- Mohab Taha, Analyst

**Responsible Users:** Aryeh Greenberg, CEO of Molly’s Restaurant

###### 1.3 Background 
Molly’s Restaurant is a world-renowned, three Michelin star restaurant with its main location in Times Square, NYC. It has four more locations situated in other major US cities. Its typical clientele consists of wealthy tourists and natives looking for a high-end culinary experience complete with irreproachable service. Recent polls and focus groups have noted a marked decline in customer satisfaction, which is putting the restaurant’s reputation on the line. An emergency meeting of shareholders has determined that the fundamental structure of the dining experience for customers must be changed at once, and that the systems utilized by employees must be modernized. Molly’s Restaurant has been around since the 20th century and has not kept up with the times; reservations are handled by phone, on-duty managers have to utilize a physical keycard to issue refunds, and the kitchen receives illegible handwritten orders, to name just a few issues. 

As such, Aryeh Greenberg, the new CEO of Molly’s Restaurant, has taken the executive decision to rework the entire system from the ground up, and center it on a mobile application to be utilized on both ends—both from the consumer side and the business’ side. The application should allow the restaurant to continue providing the stable, reliable, high-end experience for which it is known.

###### 1.4 Project Scope
The scope of this project is a mobile-based application to be utilized by customers and employees (including hosts, servers, and kitchen staff). Limited functionality is available via a web-based application for those customers who do not wish to download the fully functional application. 

The existing website will be replaced by the new web application. The phoneline-based reservation system will be discontinued in favor of the modernized approach. 

Not included in this project is the exact implementation of the web application—that part will need to be extrapolated from the mobile application after its completion, as a separate project.

###### 1.5 System Purpose
Users: Those who will primarily benefit from the new system and those who will be affected by the new system include

Customers:
	Upon implementation of the new system, customers will find app navigation,
product identification (which meal they want) and product ordering easier. Customers will be able to choose what toppings they want as well.

Hosts:
The hosts will have the ability to view their customer’s orders as well as their position in the ordering process.

Wait Staff:
Wait staff will not be spread so thin, as customers will now have the option to order via application as well. Sending orders to the kitchen will also become a more streamlined operation in which less errors will arise. 

Kitchen Staff:
The new system should reduce the workload of the kitchen staff as kitchen staff members are able to find the information they need from the application. The staff will be better able to send out their dishes on time, accordingly. 

Shareholders:
	Shareholders will benefit from reduced expenditures and losses.

















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




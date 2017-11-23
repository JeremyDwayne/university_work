# Design and Implementation
_The stage in the Software Engineering process at which an executable software system is developed_
_3/9/2016 - Lecture 1_

- design & implementation are typically interleaved
- implementation realizes the design as a program
- design and implementation activities
  - define context and interaction models
  - design system architecture

### object class identification
  - identify primary classes and their associations
  - add members through that process
  - classes may be identified using use case descriptions where nouns are classes or attributes and verbs are behaviors
    - classes may represent hardware components
    - other requirement specifications may be helpful as well

_3/14/2016_
### Design & Implementation Activities
- develop design models
  - model the association and interactions of previously identified classes
  - early decisions include determining which views and models are appropriate as discussed in chapter 5.

Specify object interfaces
  - object interfaces need to be specified so that the objects and components can be designed in parallel


### Object-Oriented Design Patterns
- reusable solutions to commonly occurring software development problems

Categories
- Behavioral Design Patters: Used to control how objects communicate
  - mediator
    - defines an object that encapsulates how a set of objects interact
    - prevents loose coupling by keeping objects from referring to each other explicitly
  - strategy
    - defines and encapsulates a family of interchangeable algorithms
    - allows the algorithm to vary independently from the contexts that use it.
    - others include observer, iterator, and template method
    

- Creational design Patterns: Used to control how classes are instantiated
  - factory method
    - defines an interface for creating objects, but lets subclasses decide which class to instantiate
    - refers to the newly created object through a common interface

- Structural Design Patterns: Used to control the composition of classes and objects
  - ensures that only one instance of a class is created
  - others include abstract factory and prototype

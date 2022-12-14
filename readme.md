# Labs on Domain-Specific Languages (DSL)

## Author
Charly REUX

## Summary
This repository is the implementation of the dsl lab course that can be found [here](https://github.com/selabs-ur1/dsl).
The goal of this project was to follow a tutorial composed of three parts:
- Domain modeling: definition of the Ecore metamodel for your language
- Textual modeling: definition of the Xtext editor for your language
- Executable modeling

## Part 3 - Executable modeling
In this part, we had to create two things:
- A compiler from the language that we had defined earlier to java, which had to be implemented in the visitor pattern and implement a state pattern. Following our course on dsl, <img src="./Images/Screenshot%20from%202022-12-01%2009-06-42.png" style="height:350px"><br> I used the Xtend's extension methods to go throught the abstract tree and create the java code from it. The reason for that, is that using a real visitor pattern may end up overflowing the stack because of non-stopping calls between the visitor and the element.
 - An interpreter, which uses the @Aspect annotation to modify the abstract tree dynamically.

Here is the architecture that I opted for for my simplified visitor pattern:<br>
<img src="./Images/classDiagram.png" style="height:400px"><br>
This architecture makes it easier to create new compilers or new interpreter, as we can see on this diagram I made two concrete classes, one which is used to compile into java, and another which is used to interpret our source language.

## Sirius
On my own I tried using sirius, I managed to create a graphical interface to create state and to show the init state but I got stuck while trying to create transitions. This is mainly due to my metamodel which is overly simplified and this could be archieved by modifying it and adding a binding from the states to the fsm.

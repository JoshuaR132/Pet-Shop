# Pet Shop Application

A simple **Java console application** that simulates buying pets from a virtual pet shop.  
The program demonstrates **object-oriented programming (OOP)** principles such as inheritance, polymorphism, and interfaces.

---

## Overview

This application represents a small **Pet Shop system** where customers can purchase different types of pets — cats, dogs, and goldfish — each with their own behaviors and attributes.  

The main program (`Main.java`) interacts with a `PetShop` class that holds an inventory of pets and provides methods to buy specific pets or find one within a given budget.

---

## Features

- **Buy a Pet by Cost:** Purchase the most expensive pet within a given budget  
- **Interact with Pets:** Stroke pets that are `Strokeable`, or listen to pets that make noises  
- **Uses Polymorphism:** Different pet types share a common `Pet` superclass but behave uniquely  

---

## Class Structure

PetShop
├── Pet (abstract class)
│    ├── Cat
│    ├── Dog
│    └── Goldfish
└── Strokeable (interface)
Main

### **Pet.java**
Base abstract class that defines shared properties such as:
- `name`
- `age`
- `cost`

It also defines a common method:
- `makeNoise()` (implemented differently by each subclass)

### **Cat.java / Dog.java / Goldfish.java**
Each subclass of `Pet` overrides the `makeNoise()` method and defines its own sound.

Cats and dogs also implement the `Strokeable` interface, which adds a `stroke()` method for interaction.

### **PetShop.java**
Handles the store’s stock and purchase logic:
- `buyCat()`
- `buyDog()`
- `buyGoldfish()`
- `buyPetByCost(double budget)`

### **Main.java**
Runs the program:
- Buys various pets
- Demonstrates pet interactions
- Shows messages in the console for user feedback

---

## 🧠 Example Output

Bought a cat: Whiskers
You stroke Whiskers. They purr happily.

Bought a dog: Buddy
You stroke Buddy. They wag their tail excitedly.

Bought a goldfish: Goldie
Goldie makes a small blub sound.

Bought a pet within budget: Mittens for $50.0
Mittens purrs softly.

---

## How to Run

### 1. Clone the repository
bash
git clone https://github.com/JoshuaR132/Pet-Shop.git
cd Pet-Shop


### 2. Compile the project

bash
javac *.java


### 3. Run the program

bash
java Main






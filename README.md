# Java Multilevel Inheritance and Method Overriding

## Overview
This project was developed for CSCI 185 – Programming II, Lab 4. It uses a vehicle class hierarchy to practice inheritance, constructor chaining, encapsulation, and method overriding.

`Car` and `Motorcycle` extend `Vehicle`, while `ElectricCar` extends `Car`, forming a multilevel inheritance relationship.

## Key Concepts
- Hierarchical inheritance: multiple classes extend `Vehicle`
- Multilevel inheritance: `ElectricCar` extends `Car`, which extends `Vehicle`
- Constructor chaining using `super()`
- Default and parameterized constructors
- Encapsulation using private fields, getters, and setters
- Method overriding using `@Override`
- Extending inherited output with `super.toString()`
- Organizing related classes into a Java package

## Files
| File | Purpose |
| --- | --- |
| `Vehicle.java` | Stores the vehicle model, brand, and year. |
| `Car.java` | Extends `Vehicle` with engine type and number of doors. |
| `Motorcycle.java` | Extends `Vehicle` with color and sidecar status. |
| `ElectricCar.java` | Extends `Car` with battery capacity and range per charge. |
| `Main.java` | Creates example vehicles and prints their details. |

## Program Behavior
The program creates:
1. A default vehicle.
2. A BMW M5 car.
3. A Harley Davidson FatBoy motorcycle.
4. An electric car example.

Each object is printed using its `toString()` method. Subclasses call `super.toString()` to include inherited information before adding their own details.

## File Setup
Rename `Main-3 (3).java` to `Main.java`.

Place the following files inside a folder named `vehiclefiles`:
- `Vehicle.java`
- `Car.java`
- `Motorcycle.java`
- `ElectricCar.java`

Keep `Main.java` in the parent folder.

## How to Run
Install a Java Development Kit (JDK), then open a terminal in the folder containing `Main.java`.

Compile:
```bash
javac Main.java vehiclefiles/Vehicle.java vehiclefiles/Car.java vehiclefiles/Motorcycle.java vehiclefiles/ElectricCar.java
```

Run:
```bash
java Main
```

## Implementation Notes
- The program uses predefined examples and does not require user input.
- Vehicle properties can be accessed and updated through getters and setters.
- Battery capacity and range values are illustrative; the code does not specify units.
- `Car.toString()` includes hardcoded BMW wording, even if a different brand is supplied.
- The classes do not validate values such as year, door count, or battery capacity.

## Author
Daniel Chung  
CSCI 185 – Programming II, Section M03  
Lab 4

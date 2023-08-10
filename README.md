# Vehicle Abstraction Project

This project demonstrates Java abstraction concepts through a vehicle hierarchy. It includes solutions to several questions that involve designing abstract classes, inheritance, method overrides, encapsulation, and exception handling.

## Questions

### Question 1: Abstract Class and Inheritance

Define an abstract class named `Vehicle` using Java abstraction. Implement two subclasses, `Bus` and `Bicycle`, inheriting from the `Vehicle` class. The `Vehicle` class should have protected properties for "Driver Name" and "Production Year". Implement public abstract methods `drive()` and `stop()`. These methods should be accessible only by their respective subclasses.

### Question 2: Interfaces and Implementation

Extend the solution from Question 1. Create interfaces `FuelOperations` and `DriverOperations` with appropriate methods. Modify the `Bus` and `Bicycle` classes to implement the relevant interfaces. Provide method implementations that reflect the behavior of each vehicle.

### Question 3: Displaying Driver Information

Given instances of the subclasses created in Question 2, implement a class `VehicleInfo` with a static method `printDriverInfo()` that takes an instance of a `DriverOperations` object and prints the driver's name. Show how this method is utilized with instances of the subclasses.

### Question 4: Exception Handling

Implement a class `DivisionHandler` with a method `divide()` that performs division operations. Handle division by zero by printing an error message and returning `null` without terminating the program.

### Usage
Each subdirectory (Question1Solution, Question2Solution, etc.) contains the Java code for the respective question. You can explore the code and run it in a Java environment.

Getting Started
1. Clone this repository: git clone https://github.com/ihsanalapsi/vehicle-abstraction-project.git
2. Navigate to the desired question's directory.
3. Compile and run the Java files to see the solutions in action.


### License
This project is licensed under the MIT License.

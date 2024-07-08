# Student Management System

This project is a simple Student Management System built using Java. It covers various fundamental concepts of Object-Oriented Programming (OOP), control statements, string manipulation, regular expressions, and algorithms for problem-solving. This README provides an overview of the project structure and the functionality implemented. The project is based on what I learned from the "Java How to Program" book by Deitel.

## Project Structure

- **Main Class**: The entry point of the application.
- **Services Class**: Provides various utility methods.
- **Instructor Class**: Represents an instructor.
- **Course Class**: Represents a course.
- **Department Class**: Represents a department.
- **Student Class**: Represents a student.

## OOP Concepts & Control Statements

### Classes and Objects
The system is designed using several classes: `Instructor`, `Course`, `Department`, and `Student`. Each class encapsulates specific attributes and behaviors relevant to the entities they represent.

### Inheritance and Polymorphism
While this basic version doesn't explicitly use inheritance, the design principles allow for easy extensions, such as creating subclasses for different types of students or courses in the future.

### Encapsulation
Attributes of the classes are private, and public methods provide access to these attributes, ensuring controlled access and modification.

### Control Statements
Various control statements (like loops and conditionals) are used in methods to perform operations like finding a student, enrolling in courses, and calculating GPA.

## String Manipulation & Regular Expressions
String manipulation is used for email validation and other string-related operations. Regular expressions can be incorporated for more complex validations if needed.

## Algorithms and Problem Solving

### Recursion, Search, Sorting, and Big O

- **Search**: Implemented a method to find a student by ID using linear search.
- **Sorting**: Implemented a method to sort students by their GPA using a custom comparator.
- **Big O**: The search and sort operations have their respective time complexities. Linear search has O(n) complexity, while sorting (using a built-in sort) has O(n log n) complexity.



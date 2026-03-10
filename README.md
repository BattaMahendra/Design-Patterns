# 🎨 Design Patterns in Java

Welcome to the Design Patterns in Java project! This repository is a comprehensive collection of classic design patterns and SOLID principles implemented in Java. It's designed to be a valuable resource for both beginners and experienced professionals looking to learn, refresh their knowledge, or prepare for technical interviews.

## 🎯 Purpose

The main goal of this project is to provide a practical and easy-to-understand guide to design patterns and SOLID principles. Each pattern and principle is explained with clear, concise theory and accompanied by practical code examples.

## 🚀 Who is this for?

*   **👩‍💻 Beginners:** If you're new to design patterns, this project will help you grasp the core concepts and learn how to apply them in your own projects.
*   **👨‍💼 Experienced Professionals:** If you're an experienced developer, you can use this project to refresh your knowledge, review best practices, and prepare for technical interviews.

## 📂 Project Structure

The project is organized into two main categories:

*   **🎨 Design Patterns:** This section covers the three main categories of design patterns:
    *   **Creational:** Patterns that deal with object creation mechanisms.
    *   **Structural:** Patterns that deal with object composition.
    *   **Behavioral:** Patterns that deal with communication between objects.
*   **SOLID Principles:** This section covers the five SOLID principles of object-oriented design.

## 🎨 Design Patterns

### 🏗️ Creational Patterns

| Pattern | Description |
| :--- | :--- |
| 🏭 **Abstract Factory** | Provides an interface for creating families of related or dependent objects without specifying their concrete classes. |
| 🧱 **Builder** | Separates the construction of a complex object from its representation, allowing the same construction process to create different representations. |
| 🏭 **Factory** | Defines an interface for creating an object, but lets subclasses alter the type of objects that will be created. |
| 🐑 **Prototype** | Creates new objects by copying an existing object, known as the prototype. |
|  singleton **Singleton** | Ensures that a class has only one instance and provides a global point of access to it. |

### 🏛️ Structural Patterns

| Pattern | Description |
| :--- | :--- |
| 🔌 **Adapter** | Allows objects with incompatible interfaces to collaborate. |
| 🎁 **Decorator** | Allows behavior to be added to an individual object, either statically or dynamically, without affecting the behavior of other objects from the same class. |
| PROXY **Proxy** | Provides a surrogate or placeholder for another object to control access to it. |

### 🏃‍♀️ Behavioral Patterns

| Pattern | Description |
| :--- | :--- |
| 👀 **Observer** | Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically. |
| 💡 **Strategy** | Defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it. |
| 📝 **Template** | Defines the skeleton of an algorithm in a method, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure. |

## SOLID Principles

| Principle | Description |
| :--- | :--- |
| **SRP** (Single Responsibility Principle) | A class should have only one reason to change. |
| **OCP** (Open/Closed Principle) | Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification. |
| **LSP** (Liskov Substitution Principle) | Subtypes must be substitutable for their base types. |
| **ISP** (Interface Segregation Principle) | Clients should not be forced to depend on interfaces they do not use. |
| **DIP** (Dependency Inversion Principle) | High-level modules should not depend on low-level modules. Both should depend on abstractions. |

## 🚀 How to Use

To run the examples, you can either import the project into your favorite IDE (like IntelliJ IDEA or Eclipse) or build it from the command line using Gradle.

```bash
./gradlew build
```

## 🙏 Contributing

Contributions are welcome! If you have any suggestions, improvements, or new patterns you'd like to add, please feel free to open an issue or submit a pull request.


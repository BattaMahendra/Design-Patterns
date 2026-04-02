# 🎨 Design Patterns & SOLID Principles in Java

Welcome! 👋 This project is your hands-on guide to mastering Java Design Patterns and SOLID principles. It's built for developers who want to learn by doing, with practical examples that make complex concepts easy to grasp. Whether you're a beginner or a pro prepping for an interview, this is for you!

## ✨ How This Project Helps You Learn

This repository is structured to give you a clear, practical learning experience.

### SOLID Principles: The "Why" and "How"

For each SOLID principle, you'll find two key packages:

*   📁 `violation`: This shows you code that *breaks* the principle. This helps you understand the "anti-pattern" and the problems it can cause.
*   📁 `with`: This shows you how to refactor the code to *follow* the principle correctly.

This side-by-side comparison is a powerful way to see the principles in action!

### Design Patterns: Theory and Practice

Each design pattern comes with:

*   📝 `Theory`: A quick, to-the-point explanation of the pattern.
*   💻 **Code Examples:** A complete, working example that shows you how to implement the pattern in a real-world scenario.

## 📚 What's Inside?

Here's a quick look at the topics covered:

### SOLID Principles

*   **S** - Single Responsibility Principle (SRP)
*   **O** - Open/Closed Principle (OCP)
*   **L** - Liskov Substitution Principle (LSP)
*   **I** - Interface Segregation Principle (ISP)
*   **D** - Dependency Inversion Principle (DIP)

### 🎨 Design Patterns

#### 🏗️ Creational Patterns
*   **Abstract Factory**: Solves the problem of creating families of related or dependent objects without specifying their concrete classes.
*   **Builder**: Solves the problem of constructing complex objects step by step, allowing the same construction process to create different representations.
*   **Factory**: Solves the problem of creating objects without specifying the exact class of object that will be created, delegating the instantiation to subclasses.
*   **Prototype**: Solves the problem of creating new objects by copying existing ones, which is useful when the cost of creating a new object from scratch is more expensive than copying an existing one.
*   **Singleton**: Solves the problem of ensuring that a class has only one instance, while providing a global point of access to this instance.

#### 🏛️ Structural Patterns
*   **Adapter**: Solves the problem of incompatible interfaces by allowing classes with incompatible interfaces to work together by wrapping an existing class with a new interface.
*   **Decorator**: Solves the problem of adding new responsibilities to objects dynamically without affecting other objects of the same class, providing a flexible alternative to subclassing.
*   **Proxy**: Solves the problem of controlling access to an object, such as delaying its creation until it's actually needed (virtual proxy), controlling access rights (protection proxy), or providing a local representative for an object in a different address space (remote proxy).

#### 🏃‍♀️ Behavioral Patterns
*   **Observer**: Solves the problem of defining a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
*   **Strategy**: Solves the problem of defining a family of algorithms, encapsulating each one, and making them interchangeable. It lets the algorithm vary independently from clients that use it.
*   **Template**: Solves the problem of defining the skeleton of an algorithm in an operation, deferring some steps to subclasses. It lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.

## 🚀 How to Use

1.  Clone the repository.
2.  Import the project into your favorite IDE (e.g., IntelliJ IDEA, Eclipse).
3.  Explore the packages, read the `Theory` files, and run the examples!

You can also build the project using Gradle:
```bash
.\gradlew build
```

## 📈 Architectural Diagrams

While I can't generate architectural diagrams directly, the code is structured to be as clear as possible. You can use tools within your IDE to visualize class relationships, which will give you a similar overview.

## 🙏 Contributing

Got an idea or a suggestion? Contributions are welcome! Please feel free to open an issue or submit a pull request.

# Lesson 9 - Small Vehicle Hierarchy

This project demonstrates inheritance, `super(...)`, method overriding, and polymorphism in Java.

## Files
- `Vehicle.java` - superclass
- `Car.java` - subclass with number of doors
- `Motorcycle.java` - subclass with optional sidecar
- `Main.java` - creates and compares a car and a motorcycle

## Run
From the `lesson-09` folder:

```bash
javac Vehicle.java Car.java Motorcycle.java Main.java
java Main
```

Both subclasses pass the is-a test: a Car is a Vehicle and a Motorcycle is a Vehicle.

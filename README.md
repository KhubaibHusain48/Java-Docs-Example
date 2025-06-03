
---

# JavaDocs Example — Documenting Code with Javadoc

## Description

This project demonstrates how to use **Javadoc** comments to document Java code. It includes class-level and method-level documentation with tags for parameters, return values, and author information.

## Features

* Provides clear documentation for the `Calculator` class.
* Documents the `add` method with `@param`, `@return`, and `@author` tags.
* Demonstrates how Javadoc can improve code readability and maintenance.

## Code Structure

* `Calculator` class: Contains a method to add two integers and a main method to demonstrate usage.

## How to Generate Javadoc

1. Compile the class:

   ```bash
   javac JavaDocs/Calculator.java
   ```

2. Generate Javadoc HTML documentation:

   ```bash
   javadoc -d doc JavaDocs/Calculator.java
   ```

3. Open the generated documentation in your browser (found in the `doc` folder).

## How to Run Program

1. Run the program:

   ```bash
   java JavaDocs.Calculator
   ```

## Sample Output

```
Sum is: 10
```

## Notes

* Javadoc comments start with `/**` and end with `*/`.
* Use tags like `@param` for method parameters, `@return` for return values, and `@author` for author information.
* Generating documentation helps other developers understand your code easily.

## Requirements

* Java JDK 8 or above
* Basic knowledge of Java syntax


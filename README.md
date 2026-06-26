# DataStructures

A collection of Data Structures, Algorithms, and Design Patterns implemented in Java.

## Overview
This repository serves as a reference for common Data Structures (DSA), Algorithms, and Design Patterns. It is structured to help developers understand implementation details through practical examples.

## Stack
- **Language:** Java 25
- **Build System:** Maven
- **Analysis:** SonarCloud

## Requirements
- **Java Development Kit (JDK):** Version 25 or higher
- **Maven:** Version 3.6.0 or higher

## Setup & Run
### Installation
Clone the repository and build the project using Maven:
```bash
git clone https://github.com/surya-verma/DataStructures.git
cd DataStructures
mvn clean install
```

### Running Examples
Since this is a collection of utilities and examples, you can run individual classes that contain a `main` method. For example:
```bash
# Example: Running the Factory Pattern demo
mvn exec:java -Dexec.mainClass="com.slothnerds.design.patterns.factory.FactoryPattern"

# Example: Running Hello World
mvn exec:java -Dexec.mainClass="com.slothnerds.dsa.HelloWorld"
```

## Project Structure
The project is organized by category:
- `com.slothnerds.algos`: Implementation of various algorithms (Dynamic Programming, General).
- `com.slothnerds.design.patterns`: Common design patterns like Factory, Observer, and Singleton.
- `com.slothnerds.dsa`: Fundamental data structures:
    - `arrays`: Cloning, Rotation, Multidimensional.
    - `linkedlists`: Singly, Doubly, and Circular Linked Lists.
    - `recursion`: Fibonacci, Factorial, Sum of Digits.
    - `search`: Binary, Jump, Fibonacci, Interpolation, etc.
    - `tree`: Binary Tree.

## Scripts & Commands
- `mvn clean compile`: Compiles the source code.
- `mvn clean install`: Builds the project and installs it to the local repository.
- `mvn sonar:sonar`: Runs SonarCloud analysis (requires configuration).

## Environment Variables
- No specific environment variables are required for basic execution.
- `SONAR_TOKEN`: (TODO) Required for SonarCloud analysis.

## Tests
- TODO: Unit tests are currently missing. Implement JUnit tests in `src/test/java`.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

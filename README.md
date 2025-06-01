# Basic Java Calculator

A simple command-line calculator program written in Java that supports basic arithmetic operations: addition, subtraction, multiplication, and division.

## Features

- Addition
- Subtraction
- Multiplication
- Division
- Repeated calculations until the user chooses to exit
- Simple user input interface using `Scanner`

## Project Structure

```
basic-java-calculator-mini-project/
├── src/
│   └── com/
│       └── calculator/
│           └── BasicCalculator.java
└── README.md
```

## How to Compile and Run

1. Open a terminal/command prompt and navigate to the project root directory (`basic-java-calculator-mini-project`).

2. Compile the Java source code:

```bash
javac -d bin src/com/calculator/BasicCalculator.java
```

This compiles the `.java` file and places the `.class` files into the `bin` directory.

3. Run the compiled program:

```bash
java -cp bin com.calculator.BasicCalculator
```

4. Follow the on-screen instructions to perform calculations.

## Usage Example

```
what do you want to do?
1.ADDITION
2.SUBSTRACTION
3.MULTIPLICATION
4.DIVISION
1
You choose Addition.
Add first number :
5
ADD second number :
10
Result : 15
Do you want to perform another operation(yes/no)
no
THANKYOU FOR USING CALCULATOR(^^).
```

## Notes

- Ensure Java is installed and the `javac` and `java` commands are available in your system PATH.
- The calculator expects valid integer inputs.
- Division by zero is not handled explicitly and will cause an exception.

## License

This project is open-source and free to use.

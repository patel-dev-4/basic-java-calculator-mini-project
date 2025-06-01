# 🔢 Java Basic & Advanced Calculator

This is a simple command-line calculator built using Java. It supports both basic arithmetic operations and advanced mathematical functions using Java's built-in `Math` class.

---

## 🚀 Features

### ✅ Basic Operations
- Addition
- Subtraction
- Multiplication
- Division (with zero check)

### ✅ Advanced Operations
- Power (`a^b`)
- Square Root (`√a`)
- Modulus (`a % b`)
- Natural Logarithm (`ln a`)
- Logarithm Base 10 (`log₁₀ a`)
- Trigonometric Functions:
  - Sine (sin °)
  - Cosine (cos °)
  - Tangent (tan °)
- Absolute Value (`|a|`)

---

## 🛠️ How to Run

1. **Clone or download** this repository.
2. **Compile the code** using:
   ```bash
   javac BasicCalculator.java
   ```
3. **Run the program** using:
   ```bash
   java com.calculator.BasicCalculator
   ```

---

## 🧠 Usage

- Follow the on-screen menu to select the operation you want.
- Input the required numbers.
- Choose to continue or exit after each operation.

> 📌 Trigonometric functions accept **degrees** as input and are converted to **radians** internally.

---

## 📦 Dependencies

- Java Standard Library
  - `java.util.Scanner` for user input
  - `java.lang.Math` for advanced operations (auto-imported)

---

## ✅ Example

```
What do you want to do?
1. ADDITION
2. SUBTRACTION
...
10. SINE
Enter your choice:
10
Enter angle in degrees:
30
Result: 0.5
```

---

## 💡 Notes

- Input validation is included for:
  - Division by zero
  - Logarithm of non-positive numbers
  - Square root of negative numbers
- The calculator runs in a loop until the user chooses to exit.

---

## 🧑‍💻 Author

Created as a beginner Java project for learning and experimentation. Feedback and contributions are welcome!

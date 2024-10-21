# Power Calculator with Support for Negative Exponents

## Overview

This Java program calculates the result of a base raised to an exponent, supporting both positive and negative exponent values. The user is prompted to input the base and the exponent, and the program calculates the result accordingly.

## How It Works

- The user is prompted to enter the **base** (`taban`) and the **exponent** (`us`).
- The program initializes a variable (`sonuc`) to store the result, starting at `1.0` to handle both positive and negative exponents.
- The program has three cases:
  - If the exponent is `0`, the result is always `1`.
  - If the exponent is positive, a loop multiplies the base value by itself the specified number of times.
  - If the exponent is negative, a loop calculates the base raised to the positive equivalent of the exponent, and then the result is inverted (i.e., `1 / result`).
- The result is printed to the console.

## How to Run the Program

1. Make sure you have Java installed on your system.
2. Copy the Java code into a file named `Main.java`.
3. Compile the Java file using the following command:

   ```
   javac Main.java
   ```

4. Run the program with the following command:

   ```
   java Main
   ```

5. Enter the base and exponent values when prompted, and the program will calculate and display the result.

## Example Output

```
Tabanı giriniz: 
2
Üssü giriniz: 
-3
Sonuç: 0.125
```

## Author

This program was created by **hekimcanaktas**.

## License

This project is licensed under the MIT License. You are free to use, modify, and distribute this software. See the [LICENSE](LICENSE) file for more details.



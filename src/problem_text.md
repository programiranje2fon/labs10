# Labs – class no. 10

## Problem 1

Create public class **KeyboardInput** in package **problem1** that has:

1. Public static method **readString**, which reads a String from the keyboard and returns it as the method's return value. If an error occurs when reading content from the keyboard, the method should throw an appropriate exception. 

2. Public static method **readNumberAndReturnSquare**, which reads a real number from the keyboard, and returns the square of that number. If an error occurs when reading content from the keyboard, the method should throw an appropriate exception. 

Create public class **KeyboardInputCheck** in the **problem1** package, which calls methods of the **KeyboardInput** class.

Create public class **KeyboardInput2** in package **problem1** that has:

1. Public static method **readAndReturnString**, which reads a String from the keyboard using the **Scanner** class, and returns it as the method's return value 

2. Public static method **readNumberAndReturnSquare**, which reads a real number from the keyboard using **Scanner**, and returns the square of that number.

Create public class **KeyboardInputCheck2** in the **problem1** package, which calls methods of the **KeyboardInput2** class.


## Problem 2
*(students work on their own)*

Add the following methods to the **KeyboardInput** class:

1. Public static method **readNumberAndCheckEven**, which reads an integer from the keyboard, and returns TRUE or FALSE depending on whether the number is divisible by 2. If an error occurs when reading content from the keyboard, the method should throw an appropriate exception.

2. Public static method **readSentenceAndReturnWordCount**, which reads a sentence from the keyboard, and returns the count of words in it. If an error occurs when reading content from the keyboard, the method should throw an appropriate exception.
 
Call the above two methods from the **KeyboardInputCheck** class.

Add the following method to the **KeyboardInput2** class:

1. Public static method **readNumberAndCheckEven**, which reads an integer from the keyboard using **Scanner**, and returns TRUE or FALSE depending on whether the number is divisible by 2. 

Test the newly created method using the **KeyboardInputCheck2** class.

#Labs – class no. 10

##Problem 1

1. Create class **KeyboardInput** in package **problem1** that has:

2. Static method **readString**, which reads a String from the keyboard and returns it as the method's return value (keyboard input, throwing checked exeptions)

3. Create class **KeyboardInputCheck** in **problem1** package, which calls the String reading method of **KeyboardInput** class.

Add to the KeyboardInput class:

4. Static method **readNumberAndReturnSquare**, which reads a real number from the keyboard, and returns the square of that number (String to double conversion, note about the conversion from String to int and boolean, note about the Scanner class)

5. Static method **readNumberAndCheckEven**, which reads an integer from the keyboard, and returns TRUE or FALSE depending on whether the number is divisible by 2.
(students write this method without help)

6. Static method **readNumberAndReturnWordCount**, which reads a sentence from the keyboard, and returns the count of words in it.
(students write this method without help)

7. Test all created methods using the **KeyboardInputCheck** class.


##Problem 2
*(worked through by the TA with students' help)*

1. Create class **KeyboardInput2** in package **problem2** that has:

2. Static method **readAndReturnString**, which reads a String from the keyboard using the **Scanner** class, and returns it as the method's return value (reading Strings from the keyboard using the Scanner class and its newLine method, that it is in the java.util pacakege, note that the exceptions are unchecked)

3. Create class **KeyboardInputCheck2** in the **problem2** package, which calls the string input method from the **KeyboardInput2** class.

Add to the **KeyboardInput2** class

4. Static method **readNumberAndReturnSquare**, which reads a real number from the keyboard using **Scanner**, and returns the square of that number (nextDouble method, note that there is no conversion when using Scanner to read numbers)

5. Static method **readNumberAndCheckEven**, which reads an integer from the keyboard using **Scanner**, and returns TRUE or FALSE depending on whether the number is divisible by 2. (nextInt method)
(students write this method without help)

7. Test all created methods using the **KeyboardInputCheck2** class.

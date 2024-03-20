package HomeWork;
//Write a program to swap 2 numbers without a temporary variable
public class Task5 {
    public static void main(String[] args) {
        int numOne = 50;
        int numTwo = 100;

        numOne = numOne + numTwo;
        numTwo = numOne - numTwo;
        numOne = numOne - numTwo;

        System.out.println("Number one is " + numOne);
        System.out.println("Number two is " + numTwo);
    }

}

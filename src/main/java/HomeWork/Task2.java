//Create an array of integer values. After the array is created,
// calculate the sum of all stored elements in that array.
package HomeWork;

public class Task2 {
    public static void main(String[] args) {
        int [] array = {100, 33, 167, 56, 88, 12, 340, 56};
        int sum = 0;
        for(int a:array) {
            sum += a;
        }
        System.out.println(sum);
    }
}

package HomeWork;
//Write a java program to find the second largest number in the array?
public class Task9 {
    public static void main(String[] args) {
        int[] array = {14, 321, 33, 83838, 9, 654, 555, 46, 6543};
        int num = 0;
        int numTwo =0;
        for(int i=0; i<array.length; i++) {
            if (array[i] > num) {
                num = numTwo;
                num = array[i];
            }
            else if (array[i] > numTwo) {
                numTwo = array[i];
            }
        }
        System.out.println(num);
        System.out.println(numTwo);
    }
}

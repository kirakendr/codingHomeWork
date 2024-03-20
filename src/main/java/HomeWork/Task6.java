package HomeWork;
//Write a java program to check whether a given number is prime or not?
public class Task6 {
    public static void main(String[] args) {

        int num = 23;
        boolean isPrime = true;

        if(num>1) {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.println(isPrime);
        }
        else {
            System.out.println("Number is NOT prime");
        }

    }
}

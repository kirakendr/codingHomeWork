package HomeWork;
//Create a 2D array or integer type where you will store odd and even numbers.
// Develop a program which will identify/print the even numbers only.
public class Task3 {
    public static void main(String[] args) {
        int [] [] array = {
                {45, 77, 18, 88},
                {91, 21, 58, 79},
                {92, 63, 38, 54}
        };
        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array[i].length; j++){
                if(array[i][j] % 2 ==0) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
    }
}

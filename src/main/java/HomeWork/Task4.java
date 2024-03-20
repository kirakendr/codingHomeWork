package HomeWork;
//Create a 2D array of integers. Develop a program which will
// calculate the sum of  even and odd numbers for that array.
public class Task4 {
    public static void main(String[] args) {
        int [] [] array = {
                {16, 17, 18, 19},
                {26, 27, 28, 29},
                {36, 37, 38, 39}
        };
        int sumEven = 0;
        int sumOdd = 0;
        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array[i].length; j++){
                if(array[i][j] % 2 == 0) {
                    sumEven+=array[i][j];
                } else if(array[i][j] % 2 != 0) {
                    sumOdd+=array[i][j];
                }
            }
        }System.out.println(sumEven);
        System.out.println(sumOdd);
    }
}

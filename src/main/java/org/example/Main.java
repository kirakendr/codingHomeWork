
//Create a 2D array or integer type where you will store odd and even numbers.
// Develop a program which will identify/print the even numbers only.

package org.example;

public class Main {
    public static void main(String[] args) {
        int [][] numbers = {
                {20, 44, 57, 18, 13},
                {15, 77, 54, 36, 91},
                {93, 55, 78, 53, 22}
        };
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers[i].length; j++) {
                if(numbers[i][j] % 2 == 0) {
                    System.out.print(numbers[i][j] + " ");
                }
            }
        }
    }
}
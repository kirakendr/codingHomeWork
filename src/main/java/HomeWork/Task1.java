package HomeWork;

import org.w3c.dom.ls.LSOutput;
//Create a program that uses an array to store a list of temperatures for a week, and then
// uses a loop to find the highest and lowest temperature for the week.


public class Task1 {
    public static void main(String[] args) {
        int [] weekTemp = {56, 70, 72, 65, 69, 72, 77};
        int theHighest = weekTemp[0];
        int theLowest = weekTemp[0];
        for(int w: weekTemp) {
            if(w>theHighest){
                theHighest = w;
            } else if(w<theLowest) {
                theLowest = w;
            }
        }
        System.out.println(theHighest);
        System.out.println(theLowest);
    }
}

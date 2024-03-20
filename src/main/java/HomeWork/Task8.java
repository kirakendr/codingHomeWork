package HomeWork;
//Maximum and minimum number in the array?
public class Task8 {
    public static void main(String[] args) {
        int[] array = {14, 321, 33, 83838, 9, 654, 555, 46, 6543};
        int max = array[0];
        int min = array[0];
        for(int a: array) {
            if(max<a) {
                max=a;
            } else if(a<min) {
                min=a;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}

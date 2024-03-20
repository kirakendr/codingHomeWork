package HomeWork;
//Write a program to print out duplicate elements from an Array of Strings?
public class Task10 {
    public static void main(String[] args) {
        String[] words = {"Toyota", "Lexus", "Tesla", "Opel", "Ford", "Lexus", "KIA", "Nissan"};
        String check = "";
        String duplicate = "";

        for (int j = 0; j < words.length; j++) {
            check = words[j];

            for (int i = j+1; i < words.length; i++) {
                if (check.equals(words[i])) {
                    duplicate = words[i];
                }
            }
        }

        System.out.println("The duplicate word is " + duplicate);
    }
}


import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char a = sc.next().charAt(0);

        if (a == 'A' || a == 'a' || a == 'E' || a == 'e' || a == 'I' || a == 'i' || a == 'O' || a == 'o' || a == 'U' || a == 'u') {
            System.out.println("You entered a vowel.");
        } else {
            System.out.println("You entered a consonant.");
        }

        sc.close();
    }
}

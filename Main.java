import java.util.Locale;
import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        String name = in.next();
        int age = in.nextInt();
        System.out.println("Привет, меня зовут " + name + ". Я работал программистом " + age + " лет.");
    }
}

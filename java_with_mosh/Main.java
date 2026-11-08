package java_with_mosh;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = scanner.nextLine().trim();
        System.out.println("Hello, " + name + "!");
        scanner.close();
    }    
}

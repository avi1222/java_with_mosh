package java_with_mosh;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte age = scanner.nextByte();
        System.out.println("You are " + age + " years old.");
        scanner.close();
    }    
}

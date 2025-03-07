import java.util.Scanner;

public class StandardInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); 

        System.out.print("Enter your age: ");
        if (scanner.hasNextInt()) {
            int age = scanner.nextInt(); 
            System.out.println("Hello, " + name + "!");
            System.out.println("You are " + age + " years old.");
        } else {
            System.out.println("Invalid input for age. Please enter a number.");
        }

        scanner.close();
    }
}

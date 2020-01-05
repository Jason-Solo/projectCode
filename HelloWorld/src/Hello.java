import java.time.Year;
import java.util.Scanner;
public class Hello {

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        System.out.println("What year were you born? ");
        int birthYear = scanner.nextInt();
        scanner.nextLine();

        int year = Year.now().getValue();
        int age = year - birthYear;
        System.out.println("Your age is " + age);


        System.out.println("\nYour name? ");
        String name = scanner.nextLine();
        System.out.println("Your name is " + name);



        scanner.close();


    }
    }







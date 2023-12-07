import java.util.ArrayList;
import java.util.Scanner;
public class ReadDogInfo {
    //Scanner class to take the console input
    Scanner scanner = new Scanner(System.in);
   public void getDogDataValue(){
       System.out.println("Lets Add Dog Information");

       System.out.print("Dog Age: ");
       int age = scanner.nextInt();

       System.out.print("Dog Name: ");
       String name = scanner.next();

       System.out.print("Dog breed: ");
       String breed = scanner.next();

       System.out.print("Dog Sex: ");
       char gender = scanner.next().charAt(0);
   }

    public void MainMenu(){
        System.out.println("*************************************************************");
        System.out.println("Welcome to our dog portal");
        System.out.println("1. Add a Dog");
        System.out.println("2. View all dogs");
        System.out.println("3. View all available dogs");
        System.out.println("4. Update dog home status");

        System.out.println("5. Exit");

    }



}

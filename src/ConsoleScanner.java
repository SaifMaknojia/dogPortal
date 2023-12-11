import java.util.Scanner;

public class ConsoleScanner {
    Scanner scanner = new Scanner(System.in);

     void inputScanner(int addDog){
         for (int i = 0; i < addDog; i++) {
             System.out.println("Lets Add Dog Information about for out dog " + (i + 1));

             System.out.print("Dog Age: ");
             Integer age = scanner.nextInt();

             System.out.print("Dog Name: ");
             String name = scanner.next();

             System.out.print("Dog breed: ");
             String breed = scanner.next();

             System.out.print("Dog Sex: ");
             char gender = scanner.next().charAt(0);

             System.out.print("Did it found home? Type 1 for yes and type 2 for no: ");
             int homeStatus = scanner.nextInt();

             boolean foundHome = homeStatus == 1 ? true : false;
             Dog dog = new Dog(i, age, name, breed, gender, foundHome);
          //   dogsArray.add(dog);
         }
    }




}

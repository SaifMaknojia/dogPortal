import java.util.ArrayList;
import java.util.Scanner;
public class ReadDogInfo {
    //Scanner class to take the console input
    Scanner scanner = new Scanner(System.in);
   public Object getDogDataValue(int i){
       System.out.println("Lets Add Dog Information");

       System.out.print("Dog Age: ");
       int age = scanner.nextInt();

       System.out.print("Dog Name: ");
       String name = scanner.next();

       System.out.print("Dog breed: ");
       String breed = scanner.next();

       System.out.print("Dog Sex: ");
       char gender = scanner.next().charAt(0);

       boolean foundHome = false;

       Dog dog = new Dog(i, age, name, breed, gender, false);
       return dog;

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

    public void getDogInfo(ArrayList<Dog> dogsArray){
        for (Dog dog : dogsArray) {
            System.out.print("Id: " + dog.id + " ");
            System.out.print("Name:" + dog.name + " ");
            System.out.print("Age: " + dog.age + " ");
            System.out.print("Breed: " + dog.breed + " ");
            System.out.print("Gender: " + dog.gender + " ");
            System.out.print("Adopted: " + dog.foundHome + " ");
            System.out.println(" ");
        }
    }

    public void isValidInput(boolean isInputValid, int userInput){
        while (!isInputValid) {
            System.out.println("******Invalid input******");
            System.out.print("Please enter your input value: ");
            userInput = scanner.nextInt();
            if (userInput == 1 || userInput == 2 || userInput == 3 || userInput == 4) {
                isInputValid = true;
                System.out.println(userInput);
            }
        }
    }

}

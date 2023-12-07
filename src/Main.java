import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReadDogInfo readDogInfo = new ReadDogInfo();

        int  userInput;
        readDogInfo.MainMenu();
        System.out.print("Choose your option from above: ");
        userInput = scanner.nextInt();
        String exit;


        ArrayList<Dog> dogsArray = new ArrayList<>();
        boolean isInputValid = userInput == 1 || userInput == 2 || userInput == 3 || userInput == 4 ? true : false;

        dogsArray.add(new Dog(1, 1, "Ella", "German Sheppard", 'f', false));
        dogsArray.add(new Dog(2, 3, "Tommy", "Husky", 'm', true));


        // Validating if input value is in menu
        while (!isInputValid) {
            System.out.println("******Invalid input******");
            System.out.print("Please enter your input value: ");
            userInput = scanner.nextInt();
            if (userInput == 1 || userInput == 2 || userInput == 3) {
                isInputValid = true;
            }
        }

        while (userInput != 5 ) {
            // What to show based on
            if (userInput == 1) {
                System.out.print("How man dogs do you want to add: ");
                int addDog = scanner.nextInt();
                System.out.println("number of dog we gonna add? : " + addDog);

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

                    System.out.println("Did it found home Type 1 for yes and type 2 for no");
                    int homeStatus = scanner.nextInt();
                    boolean foundHome = homeStatus == 1 ? true : false;
                    Dog dog = new Dog(i, age, name, breed, gender, foundHome);
                    dogsArray.add(dog);
                }
                //   readDogInfo.getDogDataValue();
            } else if (userInput == 2) {

                if (dogsArray.size() < 1) {
                    System.out.println("We don't have any dogs available now, Please check back later");
                } else {
                    for (Dog dog : dogsArray) {
                        if (!dog.foundHome) {
                            System.out.print("Id: " + dog.id + " ");
                            System.out.print("Name:" + dog.name + " ");
                            System.out.print("Age: " + dog.age + " ");
                            System.out.print("Breed: " + dog.breed + " ");
                            System.out.print("Gender: " + dog.gender + " ");
                            System.out.print("Adopted: " + dog.foundHome + " ");
                            System.out.println(" ");
                        }
                    }
                }
                break;
            } else if (userInput == 3) {
                System.out.println("Displaying all dogs in our Database");
                for (Dog dog : dogsArray) {
                    System.out.print("Id: " + dog.id + " ");
                    System.out.print("Name:" + dog.name + " ");
                    System.out.print("Age: " + dog.age + " ");
                    System.out.print("Breed: " + dog.breed + " ");
                    System.out.print("Gender: " + dog.gender + " ");
                    System.out.print("Adopted: " + dog.foundHome + " ");
                    System.out.println(" ");
                }
                break;
            } else if (userInput == 4) {
                System.out.println("Display dog to edit the status");

                for (Dog dog : dogsArray) {
                    System.out.print("Id: " + dog.id + " ");
                    System.out.print("Name:" + dog.name + " ");
                    System.out.print("Age: " + dog.age + " ");
                    System.out.print("Breed: " + dog.breed + " ");
                    System.out.print("Gender: " + dog.gender + " ");
                    System.out.print("Adopted: " + dog.foundHome + " ");
                    System.out.println(" ");
                }
                System.out.print("Choose the dog id: ");
                int updateDogStatus = scanner.nextInt();


            }
            break;
        }
    }
}
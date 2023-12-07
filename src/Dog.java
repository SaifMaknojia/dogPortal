public class Dog {
    int id;
    String name;
    int age;
    String breed;
    char gender;
    boolean foundHome;

    public Dog(int id ,  int age,String name, String breed, char gender, boolean foundHome) {

        this.id = id;
        this.age = age;
        this.name = name;
       this.breed = breed;

        this.gender = gender;
        this.foundHome = foundHome;
    }

    public void loopData(Dog dogsArray[]){
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
}

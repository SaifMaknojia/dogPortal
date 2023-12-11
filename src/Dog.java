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

    //                    System.out.print("Dog Age: ");
//                    Integer age = scanner.nextInt();
//
//                    System.out.print("Dog Name: ");
//                    String name = scanner.next();
//
//                    System.out.print("Dog breed: ");
//                    String breed = scanner.next();
//
//                    System.out.print("Dog Sex: ");
//                    char gender = scanner.next().charAt(0);
//
//                    System.out.println("Did it found home Type 1 for yes and type 2 for no");
}

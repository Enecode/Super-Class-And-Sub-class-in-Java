package srcpackage;


public class AnimalMain {
    public static void main(String[] args) {
        Cat cat = new Cat("cat", "Walk ", "Meow");
        System.out.printf("%s%s", "My name is " + cat.getName(), "\n");
        System.out.printf("%s%s", "I " + cat.move(), "\n");
        System.out.printf("%s%s", "i make " + cat.sound(), "sound");

        Dog puppy = new Dog("bingo ", "run ", "Barking ");
        System.out.println();
        System.out.println("\n");
        System.out.printf("%s%s", "My name is " + puppy.getName(), "\n");
        System.out.printf("%s%s", "I " + puppy.move(), "\n");
        System.out.printf("%s%s", "i make " + puppy.makeSound(), "sound");

        System.out.println("\n");
        Mouse mice = new Mouse("mice", "craw", "Barking");
        System.out.println();
        System.out.printf("%s%s", "I am a" + mice.getName(), "\n");
        System.out.printf("%s%s", "I " + mice.move(), "\n");
        System.out.printf("%s%s", "i make " + mice.makeSound(), "high-pitched squeak");
    }
}

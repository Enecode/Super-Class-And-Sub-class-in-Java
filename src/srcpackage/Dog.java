package srcpackage;

public class Dog extends Animal{

    public Dog(String name, String move, String sound) {
        super(name, move, sound);
    }

    @Override
    public String name() {
        return super.name();
    }

    @Override
    public String move() {
        return super.move();
    }

    @Override
    public String setSound(String sound) {

        return sound;
    }

    @Override
    public String makeSound() {
        return getSound();
    }
}

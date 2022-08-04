package srcpackage;

public class Mouse extends Animal {


    public Mouse(String name, String move, String sound) {
        super(name, move, sound);
    }

    @Override
    public String setSound(String sound) {
        return super.makeSound();
    }

    @Override
    public String move() {
        return super.move();
    }

    public String name() {
        return super.name();
    }
}

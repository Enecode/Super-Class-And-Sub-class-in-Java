package srcpackage;

public class Cat extends Animal {

    public Cat(String name, String move, String sound) {
        super(name, move, sound);
    }

    public String name() {
        return getName();
    }

    public String move(){
        return getMove();
    }

    @Override
    public String setSound(String sound) {

        return sound;
    }

    @Override
    public String getSound() {
        return super.getSound();
    }

    public String sound() {
        return getSound();
    }
}

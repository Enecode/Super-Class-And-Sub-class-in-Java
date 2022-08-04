package srcpackage;

public abstract class Animal {
    private String name;
    private  String move;
    private String Sound;


    public Animal(String name, String walk, String Sound){
        this.name = name;
        this.move = walk;
        this.Sound = Sound;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String makeSound(){
        this.Sound = "sound";
        return null;
    }

    public String getSound() {
        return Sound;
    }


    public String getName() {
        return name;
    }

    public String name(){
        if (("name".equals(name)))
            name= "name";
        return name;
    }
    public String move(){
        if (("move".equals(move)))
            move = "walking";
        return move;
    }
    public String getMove() {
        return move;
    }

    public abstract String setSound(String sound);
}

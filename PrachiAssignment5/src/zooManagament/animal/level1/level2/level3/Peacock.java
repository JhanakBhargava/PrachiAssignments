package zooManagament.animal.level1.level2.level3;
import zooManagament.animal.level1.level2.Bird;

public class Peacock extends Bird {
    private String name;
    private int age;
    private float weight;
    private final String sound = "cococo";

    public Peacock(String name, int age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getSound() {
        return sound;
    }
}

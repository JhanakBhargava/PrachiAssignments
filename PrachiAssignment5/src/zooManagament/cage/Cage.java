package zooManagament.cage;
import zooManagament.animal.level1.Animal;

public class Cage {
    private Animal animal;
    private int animalNumber;
    private int cageLimit;

    public Cage(Animal animal, int cageLimit) {
        this.animal = animal;
        this.cageLimit = cageLimit;
    }

    public Animal getAnimal() {
        return animal;
    }

    public int getCageLimit() {
        return cageLimit;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void insertAnimal() {
        this.animalNumber = 1 + this.animalNumber;
        try {
            if (this.animalNumber > cageLimit)
                throw new OutOfMemoryError();
        } catch (Exception exception) {
            System.out.println("Cage Limit crossed");
        }
    }

    public void removeAnimal() {
        this.animalNumber = this.animalNumber - 1;
    }
}

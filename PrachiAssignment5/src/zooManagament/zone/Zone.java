package zooManagament.zone;

import zooManagament.animal.level1.Animal;
import zooManagament.cage.Cage;

public class Zone {

    private Animal animal;
    private Cage cage;
    private int cageNumber;
    private boolean hasPark;
    private boolean hasCanteen;

    public Zone(Animal animal, Cage cage, int cageNumber, boolean hasPark, boolean hasCanteen) {
        this.animal = animal;
        this.cage = cage;
        this.cageNumber = cageNumber;
        this.hasPark = hasPark;
        this.hasCanteen = hasCanteen;
    }

    public void setCage(Cage cage) {
        this.cage = cage;
    }
}

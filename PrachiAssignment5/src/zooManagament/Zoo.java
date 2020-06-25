package zooManagament;

import zooManagament.animal.level1.Animal;
import zooManagament.animal.level1.level2.Mammal;
import zooManagament.animal.level1.level2.level3.Lion;
import zooManagament.zone.Zone;
import zooManagament.cage.Cage;

public class Zoo {
    public static void main(String[] args) {
        Animal mammal = new Mammal();
        Animal simba = new Lion("Simba",6, 80.5f);
        Cage cage = new Cage(simba,10);
        Zone northzone = new Zone(mammal,cage,2,true,true);
    }
}

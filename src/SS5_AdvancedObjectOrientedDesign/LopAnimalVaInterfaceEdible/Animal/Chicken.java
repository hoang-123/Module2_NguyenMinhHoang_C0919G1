package SS5_AdvancedObjectOrientedDesign.LopAnimalVaInterfaceEdible.Animal;

import SS5_AdvancedObjectOrientedDesign.LopAnimalVaInterfaceEdible.Endiable.Endiable;

public class Chicken extends Animal implements Endiable {

    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}

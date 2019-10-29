package SS5_AdvancedObjectOrientedDesign.LopAnimalVaInterfaceEdible;

import SS5_AdvancedObjectOrientedDesign.LopAnimalVaInterfaceEdible.Animal.Animal;
import SS5_AdvancedObjectOrientedDesign.LopAnimalVaInterfaceEdible.Animal.Chicken;
import SS5_AdvancedObjectOrientedDesign.LopAnimalVaInterfaceEdible.Animal.Tiger;
import SS5_AdvancedObjectOrientedDesign.LopAnimalVaInterfaceEdible.Fruit.Apple;
import SS5_AdvancedObjectOrientedDesign.LopAnimalVaInterfaceEdible.Fruit.Fruit;
import SS5_AdvancedObjectOrientedDesign.LopAnimalVaInterfaceEdible.Fruit.Orange;
import SS5_AdvancedObjectOrientedDesign.LopAnimalVaInterfaceEdible.Endiable.Endiable;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal element : animals) {
            System.out.println(element.makeSound());

            if (element instanceof Chicken) {
                System.out.println(((Chicken) element).howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}

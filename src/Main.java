import animals.Animal;
import animals.Bird;
import animals.Cat;
import animals.Dog;
import animals.Fish;

import java.util.List;

/**
 * Entry point for the OOP Animals demonstration.
 *
 * <p>This program showcases all four core Object-Oriented Programming principles
 * through a simple animal hierarchy:</p>
 *
 * <ol>
 *   <li><b>Abstraction</b>   — {@code Animal} is abstract; {@code makeSound()} has
 *       no body there and must be implemented by every subclass.</li>
 *   <li><b>Encapsulation</b> — All fields in {@code Animal} (and its subclasses) are
 *       {@code private} and are accessed only through public getters and setters.</li>
 *   <li><b>Inheritance</b>   — {@code Dog}, {@code Cat}, {@code Bird} and {@code Fish}
 *       all extend {@code Animal}, reusing its fields and behaviour.</li>
 *   <li><b>Polymorphism</b>  — A {@code List<Animal>} calls {@code makeSound()} on each
 *       object; the correct subclass version is invoked at runtime automatically.</li>
 * </ol>
 */
public class Main {

    /**
     * Application entry point.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        // -------------------------------------------------------------------------
        // 1. Create instances of each Animal subclass
        //    Each variable holds a specific type of Animal. Because Dog, Cat, Bird
        //    and Fish all extend Animal, they inherit all Animal attributes.
        // -------------------------------------------------------------------------

        Dog  myDog  = new Dog ("Buddy",    3, 3.3F, "black and white",  true,  "kennel");
        Cat  myCat  = new Cat ("Whiskers", 2, 2.0F, "ginger",           true,  "cat basket");
        Fish myFish = new Fish("Bubbles",  3, 0.1F, "gold",             false, "goldfish bowl", 4);
        Bird myBird = new Bird("Feathers", 2, 0.3F, "blue and yellow",  false, "cage in the lounge", 2, true);

        // -------------------------------------------------------------------------
        // 2. toString() — Encapsulation in action
        //    Private fields are exposed in a controlled, read-only way via the
        //    overridden toString() method in each class.
        // -------------------------------------------------------------------------

        System.out.println("=== Animal Descriptions (Encapsulation via toString) ===");
        System.out.println(myDog);
        System.out.println(myCat);
        System.out.println(myFish);
        System.out.println(myBird);

        // -------------------------------------------------------------------------
        // 3. Polymorphism — makeSound() via a List<Animal>
        //    By storing all animals in a List<Animal> we can iterate over them and
        //    call makeSound() without knowing the specific subtype at compile time.
        //    Java resolves which version to call at RUNTIME — this is polymorphism.
        // -------------------------------------------------------------------------

        System.out.println("\n=== Animal Sounds (Polymorphism via List<Animal>) ===");

        // A single list holds mixed concrete types, all treated as Animal
        List<Animal> animals = List.of(myDog, myCat, myFish, myBird);

        for (Animal animal : animals) {
            // The correct makeSound() override is called for each subtype
            animal.makeSound();
        }

        // -------------------------------------------------------------------------
        // 4. Subclass-specific behaviours
        //    Each subclass adds methods that don't exist on Animal. These can only
        //    be called through a reference of the specific subclass type.
        // -------------------------------------------------------------------------

        System.out.println("\n=== Subclass-Specific Behaviours (Inheritance) ===");
        myDog.fetch();   // Dog-only method
        myCat.climb();   // Cat-only method
        myFish.swim();   // Fish-only method
        myBird.fly();    // Bird-only method (respects the canFly flag)
    }
}

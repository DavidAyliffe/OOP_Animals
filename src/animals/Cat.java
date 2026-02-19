package animals;

/**
 * Represents a Cat — a concrete subclass of {@link Animal}.
 *
 * <p>Demonstrates:</p>
 * <ul>
 *   <li><b>Inheritance</b>  — {@code Cat} extends {@code Animal}, inheriting all
 *       its fields (name, age, weight, etc.) and methods.</li>
 *   <li><b>Polymorphism</b> — {@code makeSound()} is overridden to produce a
 *       cat-specific sound at runtime.</li>
 * </ul>
 */
public class Cat extends Animal {

    // -------------------------------------------------------------------------
    // Constructor
    // -------------------------------------------------------------------------

    /**
     * Constructs a {@code Cat} with all its attributes.
     *
     * <p>Delegates directly to the {@link Animal} constructor via {@code super}.</p>
     *
     * @param name     the cat's name
     * @param age      the cat's age in years
     * @param weight   the cat's weight in kilograms
     * @param colour   the cat's colour
     * @param friendly {@code true} if the cat is friendly
     * @param home     a description of where the cat lives
     */
    public Cat(String name, int age, float weight, String colour, boolean friendly, String home) {
        super(name, age, weight, colour, friendly, home);
    }

    // -------------------------------------------------------------------------
    // Overridden methods
    // -------------------------------------------------------------------------

    /**
     * Produces the sound a cat makes.
     *
     * <p>Overrides {@link Animal#makeSound()} to provide a cat-specific
     * implementation, demonstrating <b>polymorphism</b>.</p>
     */
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Meow! Meow!");
    }

    // -------------------------------------------------------------------------
    // Cat-specific methods
    // -------------------------------------------------------------------------

    /**
     * Simulates the cat climbing a tree.
     *
     * <p>This method is unique to {@code Cat} and illustrates how subclasses
     * can extend the base class with their own specific behaviours.</p>
     */
    public void climb() {
        System.out.println(getName() + " is climbing the tree!");
    }
}

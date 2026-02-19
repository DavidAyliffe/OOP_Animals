package animals;

/**
 * Represents a Dog — a concrete subclass of {@link Animal}.
 *
 * <p>Demonstrates:</p>
 * <ul>
 *   <li><b>Inheritance</b>   — {@code Dog} extends {@code Animal}, inheriting all
 *       its fields (name, age, weight, etc.) and methods.</li>
 *   <li><b>Polymorphism</b>  — {@code makeSound()} is overridden to produce a
 *       dog-specific sound at runtime.</li>
 *   <li><b>Overloading</b>   — Two constructors are provided: a convenience
 *       constructor (name + age only) and a full constructor.</li>
 * </ul>
 */
public class Dog extends Animal {

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Convenience constructor that only requires a name and age.
     *
     * <p>All other fields are set to sensible placeholder defaults. Useful
     * when the full details of the dog are not yet known.</p>
     *
     * @param name the dog's name
     * @param age  the dog's age in years
     */
    public Dog(String name, int age) {
        // Delegate to the full constructor with placeholder values
        super(name, age, 0.0F, "unknown", false, "unknown");
    }

    /**
     * Full constructor that initialises every attribute of the dog.
     *
     * <p>Delegates directly to the {@code Animal} constructor via {@code super},
     * which is the standard pattern when a subclass adds no new fields.</p>
     *
     * @param name     the dog's name
     * @param age      the dog's age in years
     * @param weight   the dog's weight in kilograms
     * @param colour   the dog's colour
     * @param friendly {@code true} if the dog is friendly
     * @param home     a description of where the dog lives
     */
    public Dog(String name, int age, float weight, String colour, boolean friendly, String home) {
        super(name, age, weight, colour, friendly, home);
    }

    // -------------------------------------------------------------------------
    // Overridden methods
    // -------------------------------------------------------------------------

    /**
     * Produces the sound a dog makes.
     *
     * <p>Overrides {@link Animal#makeSound()} to provide a dog-specific
     * implementation. This is the key mechanism behind <b>polymorphism</b>:
     * the correct version of this method is chosen at runtime based on the
     * actual type of the object, not the reference type.</p>
     */
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof! Woof!");
    }

    // -------------------------------------------------------------------------
    // Dog-specific methods
    // -------------------------------------------------------------------------

    /**
     * Simulates the dog fetching a ball.
     *
     * <p>This method is unique to {@code Dog} and does not exist on
     * {@code Animal}. It can only be called through a {@code Dog} reference,
     * which illustrates how subclasses extend the behaviour of a base class.</p>
     */
    public void fetch() {
        System.out.println(getName() + " is fetching the ball!");
    }
}

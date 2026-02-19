package animals;

/**
 * Represents a Fish — a concrete subclass of {@link Animal}.
 *
 * <p>Extends the base class with one fish-specific field:</p>
 * <ul>
 *   <li>{@code numberOfFins} — how many fins the fish has</li>
 * </ul>
 *
 * <p>Demonstrates:</p>
 * <ul>
 *   <li><b>Inheritance</b>   — extends {@link Animal} and inherits all its fields.</li>
 *   <li><b>Polymorphism</b>  — overrides {@code makeSound()} to reflect that fish
 *       do not actually make sounds, showing that the contract can be met in
 *       unconventional ways.</li>
 *   <li><b>Encapsulation</b> — the new field is {@code private} with a getter/setter.</li>
 * </ul>
 */
public class Fish extends Animal {

    // -------------------------------------------------------------------------
    // Fish-specific private field
    // -------------------------------------------------------------------------

    /** The number of fins this fish has. */
    private int numberOfFins;

    // -------------------------------------------------------------------------
    // Constructor
    // -------------------------------------------------------------------------

    /**
     * Constructs a {@code Fish} with all its attributes.
     *
     * <p>Calls {@code super(...)} to initialise the shared {@link Animal} fields,
     * then sets the fish-specific field directly.</p>
     *
     * @param name         the fish's name
     * @param age          the fish's age in years
     * @param weight       the fish's weight in kilograms
     * @param colour       the fish's colour
     * @param friendly     {@code true} if the fish is friendly
     * @param home         a description of where the fish lives
     * @param numberOfFins the number of fins the fish has
     */
    public Fish(String name, int age, float weight, String colour, boolean friendly,
                String home, int numberOfFins) {
        // Initialise the inherited Animal fields
        super(name, age, weight, colour, friendly, home);
        // Initialise the Fish-specific field
        this.numberOfFins = numberOfFins;
    }

    // -------------------------------------------------------------------------
    // Overridden methods
    // -------------------------------------------------------------------------

    /**
     * Reflects that fish do not make audible sounds.
     *
     * <p>This override still satisfies the {@code abstract} contract defined in
     * {@link Animal} while accurately modelling real-world behaviour. It is a
     * good reminder that polymorphism does not require all implementations to
     * behave identically — only that they fulfil the declared contract.</p>
     */
    @Override
    public void makeSound() {
        System.out.println(getName() + " doesn't make a sound — it's a fish!");
    }

    /**
     * Returns a formatted description of the fish, extending the base description
     * with information about the number of fins.
     *
     * <p>Calls {@code super.toString()} to reuse the {@link Animal} description,
     * then appends the fish-specific fin detail.</p>
     *
     * @return a full descriptive string for this fish
     */
    @Override
    public String toString() {
        return super.toString() + String.format(" It has %d fin(s).", numberOfFins);
    }

    // -------------------------------------------------------------------------
    // Fish-specific methods
    // -------------------------------------------------------------------------

    /**
     * Simulates the fish swimming.
     *
     * <p>This method is unique to {@code Fish} and illustrates how subclasses
     * extend the base class with their own specific behaviours.</p>
     */
    public void swim() {
        System.out.println(getName() + " is swimming in the ocean!");
    }

    // -------------------------------------------------------------------------
    // Getters and Setters
    // -------------------------------------------------------------------------

    /**
     * Returns the number of fins this fish has.
     * @return the fin count
     */
    public int getNumberOfFins() { return numberOfFins; }

    /**
     * Sets the number of fins.
     * @param numberOfFins the new fin count
     */
    public void setNumberOfFins(int numberOfFins) { this.numberOfFins = numberOfFins; }
}

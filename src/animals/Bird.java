package animals;

/**
 * Represents a Bird — a concrete subclass of {@link Animal}.
 *
 * <p>Extends the base class with two bird-specific fields:</p>
 * <ul>
 *   <li>{@code numberOfWings} — how many wings the bird has</li>
 *   <li>{@code canFly}        — whether the bird is capable of flight
 *       (not all birds can fly; e.g. penguins and emus)</li>
 * </ul>
 *
 * <p>Demonstrates:</p>
 * <ul>
 *   <li><b>Inheritance</b>   — extends {@link Animal} and inherits all its fields.</li>
 *   <li><b>Polymorphism</b>  — overrides {@code makeSound()} with a bird-specific sound.</li>
 *   <li><b>Encapsulation</b> — new fields are {@code private} with getters/setters.</li>
 * </ul>
 */
public class Bird extends Animal {

    // -------------------------------------------------------------------------
    // Bird-specific private fields
    // -------------------------------------------------------------------------

    /** The number of wings this bird has. */
    private int numberOfWings;

    /**
     * Whether this bird is capable of flight.
     * Not all birds can fly (e.g. penguins, ostriches, emus).
     */
    private boolean canFly;

    // -------------------------------------------------------------------------
    // Constructor
    // -------------------------------------------------------------------------

    /**
     * Constructs a {@code Bird} with all its attributes.
     *
     * <p>Calls {@code super(...)} to initialise the shared {@link Animal} fields,
     * then sets the bird-specific fields directly.</p>
     *
     * @param name          the bird's name
     * @param age           the bird's age in years
     * @param weight        the bird's weight in kilograms
     * @param colour        the bird's colour
     * @param friendly      {@code true} if the bird is friendly
     * @param home          a description of where the bird lives
     * @param numberOfWings the number of wings the bird has
     * @param canFly        {@code true} if the bird is capable of flight
     */
    public Bird(String name, int age, float weight, String colour, boolean friendly,
                String home, int numberOfWings, boolean canFly) {
        // Initialise the inherited Animal fields
        super(name, age, weight, colour, friendly, home);
        // Initialise the Bird-specific fields
        this.numberOfWings = numberOfWings;
        this.canFly        = canFly;
    }

    // -------------------------------------------------------------------------
    // Overridden methods
    // -------------------------------------------------------------------------

    /**
     * Produces the sound a bird makes.
     *
     * <p>Overrides {@link Animal#makeSound()} to provide a bird-specific
     * implementation, demonstrating <b>polymorphism</b>.</p>
     */
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Chirp! Chirp!");
    }

    /**
     * Returns a formatted description of the bird, extending the base description
     * with information about wings and flight capability.
     *
     * <p>Calls {@code super.toString()} to reuse the {@link Animal} description,
     * then appends bird-specific details. This is a clean example of code reuse
     * through inheritance.</p>
     *
     * @return a full descriptive string for this bird
     */
    @Override
    public String toString() {
        return super.toString() + String.format(
                " It has %d wing(s) and %s fly.",
                numberOfWings, (canFly ? "can" : "cannot")
        );
    }

    // -------------------------------------------------------------------------
    // Bird-specific methods
    // -------------------------------------------------------------------------

    /**
     * Simulates the bird flying — or reports that it cannot fly.
     *
     * <p>Unlike a naive implementation, this method checks the {@code canFly}
     * flag before reporting flight. A penguin or emu should never claim to
     * be flying through the sky.</p>
     */
    public void fly() {
        if (canFly) {
            System.out.println(getName() + " is soaring through the sky!");
        } else {
            System.out.println(getName() + " cannot fly!");
        }
    }

    // -------------------------------------------------------------------------
    // Getters and Setters
    // -------------------------------------------------------------------------

    /**
     * Returns the number of wings this bird has.
     * @return the wing count
     */
    public int getNumberOfWings() { return numberOfWings; }

    /**
     * Sets the number of wings.
     * @param numberOfWings the new wing count
     */
    public void setNumberOfWings(int numberOfWings) { this.numberOfWings = numberOfWings; }

    /**
     * Returns whether this bird is capable of flight.
     * @return {@code true} if the bird can fly
     */
    public boolean canFly() { return canFly; }

    /**
     * Sets whether this bird can fly.
     * @param canFly {@code true} if the bird can fly
     */
    public void setCanFly(boolean canFly) { this.canFly = canFly; }
}

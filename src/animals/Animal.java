package animals;

/**
 * Abstract base class representing a generic animal.
 *
 * <p>This class demonstrates three core OOP principles:</p>
 * <ul>
 *   <li><b>Abstraction</b>   — {@code makeSound()} is declared abstract, forcing every
 *       subclass to provide its own implementation.</li>
 *   <li><b>Encapsulation</b> — All fields are {@code private} and are only accessible
 *       through public getter and setter methods.</li>
 *   <li><b>Inheritance</b>   — Dog, Cat, Bird and Fish all extend this class and
 *       inherit its fields and behaviour.</li>
 * </ul>
 *
 * <p>Because {@code Animal} is abstract it cannot be instantiated directly —
 * you must create an instance of a concrete subclass instead.</p>
 */
public abstract class Animal {

    // -------------------------------------------------------------------------
    // Private fields — Encapsulation: data is hidden from outside classes and
    // can only be read or modified through the getters / setters below.
    // -------------------------------------------------------------------------

    /** The animal's name. */
    private String name;

    /** The animal's age in years. */
    private int age;

    /** The animal's weight in kilograms. */
    private float weight;

    /** The animal's colour. */
    private String colour;

    /** Whether the animal is considered friendly. */
    private boolean friendly;

    /** A description of where the animal lives. */
    private String home;

    // -------------------------------------------------------------------------
    // Constructor
    // -------------------------------------------------------------------------

    /**
     * Constructs an {@code Animal} with all its core attributes.
     *
     * <p>This constructor is called by every subclass via {@code super(...)} to
     * ensure the shared fields are always properly initialised.</p>
     *
     * @param name     the animal's name
     * @param age      the animal's age in years
     * @param weight   the animal's weight in kilograms
     * @param colour   the animal's colour
     * @param friendly {@code true} if the animal is friendly, {@code false} otherwise
     * @param home     a description of where the animal lives
     */
    public Animal(String name, int age, float weight, String colour, boolean friendly, String home) {
        this.name     = name;
        this.age      = age;
        this.weight   = weight;
        this.colour   = colour;
        this.friendly = friendly;
        this.home     = home;
    }

    // -------------------------------------------------------------------------
    // Abstract method — Abstraction
    // -------------------------------------------------------------------------

    /**
     * Makes the sound characteristic of this animal.
     *
     * <p>This method is {@code abstract}: it has no body here and <em>must</em>
     * be overridden in every concrete subclass. Calling it through a base-class
     * reference at runtime is the classic demonstration of <b>polymorphism</b>
     * — the correct subclass version is invoked automatically.</p>
     */
    public abstract void makeSound();

    // -------------------------------------------------------------------------
    // toString — Human-readable description of the animal
    // -------------------------------------------------------------------------

    /**
     * Returns a formatted, human-readable description of this animal.
     *
     * <p>Subclasses that have extra fields (e.g. {@code Bird} and {@code Fish})
     * override this method and call {@code super.toString()} to build on it,
     * appending their additional details.</p>
     *
     * @return a descriptive string summarising the animal's key attributes
     */
    @Override
    public String toString() {
        return String.format(
                "%s is %d years old, weighs %.1fkg, is %s in colour, %s friendly, and lives in a %s.",
                name, age, weight, colour,
                (friendly ? "is" : "is NOT"),
                home
        );
    }

    // -------------------------------------------------------------------------
    // Getters and Setters — public interface to the private fields
    // -------------------------------------------------------------------------

    /**
     * Returns the animal's name.
     * @return the name
     */
    public String getName() { return name; }

    /**
     * Sets the animal's name.
     * @param name the new name
     */
    public void setName(String name) { this.name = name; }

    /**
     * Returns the animal's age in years.
     * @return the age
     */
    public int getAge() { return age; }

    /**
     * Sets the animal's age.
     * @param age the new age in years
     */
    public void setAge(int age) { this.age = age; }

    /**
     * Returns the animal's weight in kilograms.
     * @return the weight
     */
    public float getWeight() { return weight; }

    /**
     * Sets the animal's weight.
     * @param weight the new weight in kilograms
     */
    public void setWeight(float weight) { this.weight = weight; }

    /**
     * Returns the animal's colour.
     * @return the colour
     */
    public String getColour() { return colour; }

    /**
     * Sets the animal's colour.
     * @param colour the new colour
     */
    public void setColour(String colour) { this.colour = colour; }

    /**
     * Returns whether the animal is friendly.
     * @return {@code true} if friendly, {@code false} otherwise
     */
    public boolean isFriendly() { return friendly; }

    /**
     * Sets the animal's friendliness.
     * @param friendly {@code true} if friendly, {@code false} otherwise
     */
    public void setFriendly(boolean friendly) { this.friendly = friendly; }

    /**
     * Returns a description of where the animal lives.
     * @return the home description
     */
    public String getHome() { return home; }

    /**
     * Sets the animal's home.
     * @param home a description of where the animal lives
     */
    public void setHome(String home) { this.home = home; }
}

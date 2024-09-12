class Animal {
    private String name;
    private int age;
    private float weight;
    private String colour;
    private boolean friendly;
    private String home;

    // Constructor to initialize the Animal object
    public Animal(String name, int age, float weight, String colour, boolean friendly, String home) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.colour = colour;
        this.friendly = friendly;
        this.home = home;
    }

    // Public method to get the animal's name
    public String getName() {
        return name;
    }

    // Public method to set the animal's name
    public void setName( String sName ) {
        this.name = sName;
    }

    // Public method to get the animal's age
    public int getAge() {
        return age;
    }

    // Public method to set the animal's age
    public void setAge(int age){
        this.age = age;
    }

    // Method to demonstrate polymorphism
    public void makeSound() {
        System.out.println("This animal makes a sound.");
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFriendly() {
        return friendly;
    }

    public void setFriendly(boolean friendly) {
        this.friendly = friendly;
    }
}

// Inheritance: Dog class inherits from Animal class
class Dog extends Animal {

    // Default Constructor for Dog that calls the parent constructor
    public Dog(String name, int age) {
        super(name, age, 0.0F, "black", false, "nowhere");
    }

    // Full Constructor for Dog that calls the parent constructor
    public Dog(String name, int age, float weight, String colour, boolean friendly, String home) {
        super(name, age, weight, colour, friendly, home);
    }


    // Overriding the makeSound method to demonstrate polymorphism
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    // Additional method specific to Dog class
    public void fetch() {
        System.out.println(getName() + " is fetching the ball!");
    }
}

// Inheritance: Cat class inherits from Animal class
class Cat extends Animal {

    // Constructor for Cat that calls the parent constructor
    public Cat(String name, int age, float weight, String colour, boolean friendly, String home) {
        super(name, age, weight, colour, friendly, home);
    }

    // Overriding the makeSound method to demonstrate polymorphism
    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }

    // Additional method specific to Cat class
    public void climb() {
        System.out.println(getName() + " is climbing the tree!");
    }
}

// Inheritance: Cat class inherits from Animal class
class Bird extends Animal {

    private int numberOfWings;
    private boolean canFly;

    // Constructor for Bird that calls the parent constructor
    public Bird(String name, int age, float weight, String colour, boolean friendly, String home, int numberOfWings, boolean canFly) {
        super(name, age, weight, colour, friendly, home);
        this.numberOfWings = numberOfWings;
        this.canFly = canFly;
    }

    // Overriding the makeSound method to demonstrate polymorphism
    @Override
    public void makeSound() {
        System.out.println("Chirp! Chirp!");
    }

    // Additional method specific to Bird class
    public void fly() {
        System.out.println(getName() + " is flying in the sky!");
    }

    public int getNumberOfWings() {
        return numberOfWings;
    }

    public void setNumberOfWings(int numberOfWings) {
        this.numberOfWings = numberOfWings;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}

// Inheritance: Fish class inherits from Animal class
class Fish extends Animal {

    private int numberOfFins;

    // Constructor for Cat that calls the parent constructor
    public Fish(String name, int age, float weight, String colour, boolean friendly, String home, int numberOfFins) {
        super(name, age, weight, colour, friendly, home);
        this.numberOfFins = numberOfFins;
    }

    // Overriding the makeSound method to demonstrate polymorphism
    @Override
    public void makeSound() {
        System.out.println("I'm a fish.  I don't make sounds!");
    }

    // Additional method specific to Fish class
    public void swim() {
        System.out.println(getName() + " is swimming in the ocean!");
    }

    public int getNumberOfFins() {
        return numberOfFins;
    }

    public void setNumberOfFins(int numberOfFins) {
        this.numberOfFins = numberOfFins;
    }
}


public class Main {
    public static void main(String[] args) {
        // Creating objects of Dog and Cat classes
        Dog myDog = new Dog("Buddy", 3, 3.3F, "black and white", false, "kennel");
        Cat myCat = new Cat("Whiskers", 2, 2.0F, "ginger", true, "cat basket");
        Fish myFish = new Fish("Bubbles", 3, 3.3F, "gold", false, "goldfish bowl", 4);
        Bird myBird = new Bird("Feathers", 2, 2.0F, "blue and yellow", false, "cage in the lounge", 2, true);

        // Demonstrating encapsulation: Accessing private fields via public methods
        System.out.printf( "%s is %d years old. It %s friendly and it lives in a %s.\n", myDog.getName(), myDog.getAge(), (myDog.isFriendly() ? "is" : "is NOT"), myDog.getHome() );
        System.out.printf( "%s is %d years old. It %s friendly and it lives in a %s.\n", myCat.getName(), myCat.getAge(), (myCat.isFriendly() ? "is" : "is NOT"), myCat.getHome() );
        System.out.printf( "%s is %d years old. It %s friendly and it lives in a %s.  It has %d fins.\n", myFish.getName(), myFish.getAge(), (myFish.isFriendly() ? "is" : "is NOT" ), myFish.getHome(), myFish.getNumberOfFins() );
        System.out.printf( "%s is %d years old. It %s friendly and it lives in a %s.  It has %d wings and %s fly.\n", myBird.getName(), myBird.getAge(), (myBird.isFriendly() ? "is" : "is NOT"), myBird.getHome(), myBird.getNumberOfWings(), ( myBird.isCanFly() ? "can" : "cannot" ) );

        // Demonstrating polymorphism: Different animals make different sounds
        myDog.makeSound();
        myCat.makeSound();
        myFish.makeSound();
        myBird.makeSound();


        // Calling methods specific to Dog and Cat classes
        myDog.fetch();
        myCat.climb();
        myFish.swim();
        myBird.fly();

    }
}


/*
To Animal class
float weight
String colour
boolean friendly
String home


Bird
boolean canFly;
int numberOfWings;
fly()

Fish
int numberOfFins
swim()

Override the makesound() method for these new classes
*/
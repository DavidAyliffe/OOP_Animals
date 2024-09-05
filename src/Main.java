class Animal {
    private String name;
    private int age;
    private float weight;

    // Constructor to initialize the Animal object
    public Animal(String name, int age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Public method to get the animal's name
    public String getName() {
        return name;
    }

    // Public method to set the animal's name
    public void setName( String sName ) {
        this.name = name;
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
}

// Inheritance: Dog class inherits from Animal class
class Dog extends Animal {

    // Default Constructor for Dog that calls the parent constructor
    public Dog(String name, int age) {
        super(name, age, 0.0F);
    }

    // Full Constructor for Dog that calls the parent constructor
    public Dog(String name, int age, float weight) {
        super(name, age, weight);
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
    public Cat(String name, int age) {
        super(name, age);
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

public class Main {
    public static void main(String[] args) {
        // Creating objects of Dog and Cat classes
        Dog myDog = new Dog("Buddy", 3);
        Cat myCat = new Cat("Whiskers", 2);

        // Demonstrating encapsulation: Accessing private fields via public methods
        System.out.println(myDog.getName() + " is " + myDog.getAge() + " years old.");
        System.out.println(myCat.getName() + " is " + myCat.getAge() + " years old.");

        // Demonstrating polymorphism: Different animals make different sounds
        myDog.makeSound();
        myCat.makeSound();

        // Calling methods specific to Dog and Cat classes
        myDog.fetch();
        myCat.climb();
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
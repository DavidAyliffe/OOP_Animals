# 🐾 OOP Animals — Java

A hands-on Java project demonstrating the four core principles of **Object-Oriented Programming (OOP)** through a simple animal class hierarchy.

---

## 📚 OOP Concepts Demonstrated

| Concept | Description | Where Applied |
|---|---|---|
| 🔒 **Encapsulation** | All fields are `private`; data is accessed only through public getters and setters | `Animal` and all subclasses |
| 🧬 **Inheritance** | `Dog`, `Cat`, `Bird`, and `Fish` all extend `Animal`, reusing its fields and behaviour | Every subclass |
| 🎭 **Polymorphism** | `makeSound()` is called on a `List<Animal>` — Java picks the correct override at runtime | `Main.java` loop |
| 💡 **Abstraction** | `Animal` is `abstract`; `makeSound()` has no body and *must* be implemented by subclasses | `Animal.java` |

---

## 🌳 Class Hierarchy

```
Animal  (abstract base class)
├── 🐕  Dog
├── 🐈  Cat
├── 🐦  Bird
└── 🐟  Fish
```

---

## 🗂️ Project Structure

```
OOP_Animals/
├── src/
│   ├── Main.java               ← Entry point (imports animals.*)
│   └── animals/
│       ├── Animal.java         ← Abstract base class
│       ├── Dog.java            ← Extends Animal; adds fetch()
│       ├── Cat.java            ← Extends Animal; adds climb()
│       ├── Bird.java           ← Extends Animal; adds canFly, numberOfWings, fly()
│       └── Fish.java           ← Extends Animal; adds numberOfFins, swim()
└── README.md
```

---

## 🔍 Class Overview

### 🐾 `Animal` — Abstract Base Class
The foundation of the hierarchy. Defines the fields and behaviour common to every animal.

| Field | Type | Description |
|---|---|---|
| `name` | `String` | The animal's name |
| `age` | `int` | Age in years |
| `weight` | `float` | Weight in kilograms |
| `colour` | `String` | The animal's colour |
| `friendly` | `boolean` | Whether the animal is friendly |
| `home` | `String` | Where the animal lives |

- All fields are **private** (encapsulation).
- `makeSound()` is declared **abstract** — every subclass must provide its own version.
- `toString()` returns a human-readable summary; subclasses extend it with `super.toString()`.

---

### 🐕 `Dog` — extends `Animal`
| Feature | Detail |
|---|---|
| Extra methods | `fetch()` — simulates fetching a ball |
| Constructors | Convenience (`name`, `age` only) and full constructor |
| Sound | `"Woof! Woof!"` |

---

### 🐈 `Cat` — extends `Animal`
| Feature | Detail |
|---|---|
| Extra methods | `climb()` — simulates climbing a tree |
| Sound | `"Meow! Meow!"` |

---

### 🐦 `Bird` — extends `Animal`
| Feature | Detail |
|---|---|
| Extra fields | `numberOfWings` (`int`), `canFly` (`boolean`) |
| Extra methods | `fly()` — checks `canFly` before reporting flight; not all birds can fly! |
| Sound | `"Chirp! Chirp!"` |
| `toString()` | Appends wing count and flight capability to the base description |

> 💡 **Design note:** `fly()` checks the `canFly` flag so that flightless birds (penguins, emus, ostriches) are handled correctly.

---

### 🐟 `Fish` — extends `Animal`
| Feature | Detail |
|---|---|
| Extra fields | `numberOfFins` (`int`) |
| Extra methods | `swim()` — simulates swimming |
| Sound | Reports that fish don't make sounds — still satisfies the abstract contract! |
| `toString()` | Appends fin count to the base description |

---

## 🚀 How to Compile and Run

### Prerequisites
- Java Development Kit (JDK) 11 or later

### From the terminal

```bash
# Navigate to the project root
cd OOP_Animals

# Compile all source files
javac -d out src/animals/*.java src/Main.java

# Run the program
java -cp out Main
```

### From IntelliJ IDEA
1. Open the project in IntelliJ IDEA.
2. Mark `src/` as the **Sources Root** (right-click → Mark Directory as → Sources Root).
3. Click the green ▶ **Run** button next to `main()` in `Main.java`.

---

## 📤 Sample Output

```
=== Animal Descriptions (Encapsulation via toString) ===
Buddy is 3 years old, weighs 3.3kg, is black and white in colour, is friendly, and lives in a kennel.
Whiskers is 2 years old, weighs 2.0kg, is ginger in colour, is friendly, and lives in a cat basket.
Bubbles is 3 years old, weighs 0.1kg, is gold in colour, is NOT friendly, and lives in a goldfish bowl. It has 4 fin(s).
Feathers is 2 years old, weighs 0.3kg, is blue and yellow in colour, is NOT friendly, and lives in a cage in the lounge. It has 2 wing(s) and can fly.

=== Animal Sounds (Polymorphism via List<Animal>) ===
Buddy says: Woof! Woof!
Whiskers says: Meow! Meow!
Bubbles doesn't make a sound — it's a fish!
Feathers says: Chirp! Chirp!

=== Subclass-Specific Behaviours (Inheritance) ===
Buddy is fetching the ball!
Whiskers is climbing the tree!
Bubbles is swimming in the ocean!
Feathers is soaring through the sky!
```

---

## 🎓 Key Learning Points

### 🔒 Why Encapsulation?
Making fields `private` protects the internal state of an object. External code cannot accidentally (or maliciously) set an animal's age to `-5`. The setter is the right place to add validation if needed.

### 🧬 Why Inheritance?
`Dog`, `Cat`, `Bird`, and `Fish` don't need to redeclare `name`, `age`, `weight`, etc. They inherit those fields from `Animal`. Changes to the base class automatically apply to all subclasses — a core tenet of the **DRY** (Don't Repeat Yourself) principle.

### 🎭 Why Polymorphism?
By holding all animals in a `List<Animal>`, new animal types can be added in future without changing the loop in `main`. You only need to create the new subclass and implement `makeSound()`. This is the **Open/Closed Principle** in action: open for extension, closed for modification.

### 💡 Why Abstraction?
Declaring `Animal` as `abstract` and `makeSound()` as an abstract method makes it *impossible* to forget to implement it. The Java compiler will refuse to compile a concrete subclass that doesn't provide an implementation — a safety net built into the language.

---

## 💡 Possible Extensions

- 🏷️ Add an `interface Swimmable` and `interface Flyable` to further model capabilities
- 🐠 Add more animal subclasses (e.g. `Snake`, `Rabbit`, `Horse`)
- ✅ Add input validation to setters (e.g. reject negative ages or weights)
- 🗃️ Store animals in an `ArrayList` and add search/filter methods
- 🧪 Write JUnit tests for each class

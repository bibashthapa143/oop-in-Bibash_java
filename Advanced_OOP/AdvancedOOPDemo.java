import java.util.*;

/*
 * ============================================================
 * THEORY: Advanced OOP Concepts in Java
 * ============================================================
 * This program demonstrates several advanced object-oriented
 * features that go beyond the four basic pillars:
 *
 * 1. Interfaces with default & static methods (Java 8+)
 * 2. Multiple inheritance of TYPE via interfaces
 * 3. Abstract classes combined with interfaces
 * 4. Static, instance, and inner (nested) classes
 * 5. Anonymous inner classes
 * 6. The 'final' keyword (constants, non-overridable methods,
 *    non-inheritable classes)
 * 7. Enum types
 * ============================================================
 */

// ---------- 1 & 2: Interfaces with default/static methods, multiple inheritance of type ----------
interface Flyable {
    void fly();

    default void takeOff() { // default method - has a body, optional to override
        System.out.println("Taking off for flight...");
    }
}

interface Swimmable {
    void swim();

    static void diveTip() { // static interface method
        System.out.println("Tip: hold your breath while diving!");
    }
}

// A class can implement MULTIPLE interfaces -> multiple inheritance of type
class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck is flying.");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming.");
    }
}

// ---------- 6: 'final' keyword ----------
final class ImmutablePoint {          // final class - cannot be extended
    final int x, y;                    // final fields - assigned once
    ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    final void display() {             // final method - cannot be overridden
        System.out.println("Point(" + x + ", " + y + ")");
    }
}

// ---------- 4: Static nested class & inner (non-static) class ----------
class Outer {
    private String outerField = "Outer Data";
    private static String staticField = "Static Outer Data";

    // Static nested class - does not need an Outer instance
    static class StaticNested {
        void display() {
            System.out.println("Static Nested Class can access: " + staticField);
        }
    }

    // Inner (non-static) class - needs an Outer instance, can access its fields
    class Inner {
        void display() {
            System.out.println("Inner Class can access: " + outerField);
        }
    }
}

// ---------- 7: Enum ----------
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }
}

public class AdvancedOOPDemo {
    public static void main(String[] args) {

        System.out.println("--- Interfaces: default & static methods ---");
        Duck duck = new Duck();
        duck.takeOff();  // default method from Flyable
        duck.fly();
        duck.swim();
        Swimmable.diveTip(); // static method called via interface name

        System.out.println("\n--- final keyword ---");
        ImmutablePoint p = new ImmutablePoint(3, 4);
        p.display();
        // class Bad extends ImmutablePoint {} // NOT ALLOWED - final class

        System.out.println("\n--- Static Nested Class ---");
        Outer.StaticNested nested = new Outer.StaticNested(); // no Outer instance needed
        nested.display();

        System.out.println("\n--- Inner (Non-static) Class ---");
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner(); // requires an Outer instance
        inner.display();

        System.out.println("\n--- Anonymous Inner Class ---");
        Flyable superhero = new Flyable() {  // implementing interface on the fly
            @Override
            public void fly() {
                System.out.println("Superhero flies without wings!");
            }
        };
        superhero.takeOff();
        superhero.fly();

        System.out.println("\n--- Enum ---");
        for (Day day : Day.values()) {
            System.out.println(day + " -> Weekend? " + day.isWeekend());
        }
    }
}

/*
 * ============================================================
 * SAMPLE OUTPUT
 * ============================================================
 * --- Interfaces: default & static methods ---
 * Taking off for flight...
 * Duck is flying.
 * Duck is swimming.
 * Tip: hold your breath while diving!
 *
 * --- final keyword ---
 * Point(3, 4)
 *
 * --- Static Nested Class ---
 * Static Nested Class can access: Static Outer Data
 *
 * --- Inner (Non-static) Class ---
 * Inner Class can access: Outer Data
 *
 * --- Anonymous Inner Class ---
 * Taking off for flight...
 * Superhero flies without wings!
 *
 * --- Enum ---
 * MONDAY -> Weekend? false
 * TUESDAY -> Weekend? false
 * WEDNESDAY -> Weekend? false
 * THURSDAY -> Weekend? false
 * FRIDAY -> Weekend? false
 * SATURDAY -> Weekend? true
 * SUNDAY -> Weekend? true
 * ============================================================
 */

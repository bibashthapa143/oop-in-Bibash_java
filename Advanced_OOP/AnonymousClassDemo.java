/*
 * THEORY: An anonymous inner class is a class without a name,
 * declared and instantiated in a single expression - typically
 * used to provide a one-off implementation of an interface or
 * abstract class without creating a separate named class file.
 */
interface Greeting {
    void greet(String name);
}

public class AnonymousClassDemo {
    public static void main(String[] args) {
        // Anonymous class implementing the Greeting interface on the fly
        Greeting formalGreeting = new Greeting() {
            @Override
            public void greet(String name) {
                System.out.println("Good day, " + name + ".");
            }
        };

        Greeting casualGreeting = new Greeting() {
            @Override
            public void greet(String name) {
                System.out.println("Hey " + name + "!");
            }
        };

        formalGreeting.greet("Dr. Sharma");
        casualGreeting.greet("Ram");

        // Anonymous class extending a Thread
        Thread worker = new Thread() {
            @Override
            public void run() {
                System.out.println("Anonymous thread subclass is running.");
            }
        };
        worker.start();
    }
}
/*
 * SAMPLE OUTPUT
 * Good day, Dr. Sharma.
 * Hey Ram!
 * Anonymous thread subclass is running.
 */

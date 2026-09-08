/*
 * THEORY: A static initializer block runs ONCE, when the class is
 * first loaded into memory - before any object is created or any
 * static member is accessed - and is used to initialize static
 * fields with complex logic. An instance initializer block runs
 * every time an object is created, just before the constructor.
 */
class Config {
    static String appName;
    static int version;

    static { // static block - runs once at class loading
        appName = "LabManager";
        version = 1;
        System.out.println("Static block executed: class Config loaded.");
    }

    int instanceId;
    { // instance initializer block - runs before every constructor call
        instanceId = (int) (Math.random() * 1000) % 100 + 1;
        System.out.println("Instance block executed for new object.");
    }

    Config() {
        System.out.println("Constructor executed. instanceId set.");
    }
}

public class StaticInitializerBlockDemo {
    public static void main(String[] args) {
        System.out.println("App: " + Config.appName + " v" + Config.version);
        System.out.println("\nCreating first object:");
        Config c1 = new Config();
        System.out.println("\nCreating second object:");
        Config c2 = new Config();
        System.out.println("\n(Static block ran only once; instance block ran for each object)");
    }
}
/*
 * SAMPLE OUTPUT (instanceId values will vary due to Math.random())
 * Static block executed: class Config loaded.
 * App: LabManager v1
 *
 * Creating first object:
 * Instance block executed for new object.
 * Constructor executed. instanceId set.
 *
 * Creating second object:
 * Instance block executed for new object.
 * Constructor executed. instanceId set.
 *
 * (Static block ran only once; instance block ran for each object)
 */

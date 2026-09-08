/*
 * THEORY: An enum is a special class representing a fixed set of
 * constants. Unlike simple constants, Java enums can have fields,
 * constructors, and methods, making them full-featured types.
 */
enum Season {
    WINTER(5), SPRING(20), SUMMER(35), AUTUMN(18); // each constant calls the constructor

    private final int avgTempCelsius;

    Season(int avgTempCelsius) {
        this.avgTempCelsius = avgTempCelsius;
    }

    int getAvgTemp() {
        return avgTempCelsius;
    }
}

public class EnumDemo {
    public static void main(String[] args) {
        for (Season season : Season.values()) {
            System.out.println(season + " -> avg temp: " + season.getAvgTemp() + "C");
        }

        Season current = Season.SUMMER;
        switch (current) {
            case SUMMER:
                System.out.println("\nIt's hot, stay hydrated!");
                break;
            case WINTER:
                System.out.println("\nIt's cold, wear a jacket!");
                break;
            default:
                System.out.println("\nEnjoy the season!");
        }
    }
}
/*
 * SAMPLE OUTPUT
 * WINTER -> avg temp: 5C
 * SPRING -> avg temp: 20C
 * SUMMER -> avg temp: 35C
 * AUTUMN -> avg temp: 18C
 *
 * It's hot, stay hydrated!
 */

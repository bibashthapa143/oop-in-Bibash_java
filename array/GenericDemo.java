class Box<T> {
    private T items;

    public Box(T items) {
        this.items = items;
    }

    public T getItem() {
        return items;
    }

    public void setItem(T items) {
        this.items = items;
    }
}

public class GenericDemo {
    public static void main(String[] args) {

        Box<Integer> intBox = new Box<>(100);
        System.out.println(intBox.getItem());

        Box<String> stringBox = new Box<>("Hello");
        System.out.println(stringBox.getItem());

        Box<Double> doubleBox = new Box<>(25.5);
        System.out.println(doubleBox.getItem());
    }
}

class Animal {
    String name = "Animal";
}

class Dog extends Animal {
    String name = "Dog";

    void display() {
        System.out.println(this.name);        // Child class variable
        System.out.println(super.name);      // Parent class variable
    }
}

public class SuperConcept {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}
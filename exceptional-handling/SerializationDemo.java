import java.io.*;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SerializationDemo {
    public static void main(String[] args) {
        Student student1 = new Student(101, "Alex Mercer");

        // Serialization
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            out.writeObject(student1);
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            System.out.println("Serialization Error: " + e.getMessage());
        }

        // Deserialization
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student deserializedStudent = (Student) in.readObject();
            System.out.println("Object deserialized successfully.");
            System.out.println("Student ID: " + deserializedStudent.id);
            System.out.println("Student Name: " + deserializedStudent.name);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization Error: " + e.getMessage());
        }
    }
}
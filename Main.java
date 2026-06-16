class Student{
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

}



public class Main {
    public static void main(String[] args){
        Student s1= new Student();
        s1.setName("Johan");
        s1.setAge(20);

        System.out.println(s1.getName() + " " + s1.getAge());
    }
    
}

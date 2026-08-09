public class interfacechild implements interfaceExample{
    public void sum() {
        int sum = 5 + 7;
        System.out.println("The sum is: " + sum);
    }

    public void sub() {
        int sub = 10 - 5;
        System.out.println("The subtraction is: " + sub);
    }
    public static void main(String[] args) {
        interfacechild obj = new interfacechild();
        
        obj.sum();
        obj.sub();
    }
    
}

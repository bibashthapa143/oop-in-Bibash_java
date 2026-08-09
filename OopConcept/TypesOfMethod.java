public class TypesOfMethod {

    public void add() {
        int sum = 10 + 20;
        System.out.println(sum);
    }

    public void add(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public int add1() {
        return 10 + 20;
    }

    public static void main(String[] args) {
        TypesOfMethod obj = new TypesOfMethod();

        obj.add();          // 30
        obj.add(5, 10);     // 15

        int result = obj.add1();
        System.out.println(result); // 30
    }
}
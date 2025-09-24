package OOPs;

public class wrapper {
    public static void main(String[] args) {
        // Example 1: Testing swap
        int a = 10;
        int b = 20;

        swap(a, b);
        System.out.println("After swap attempt: " + a + " " + b); // still 10, 20

        // Example 2: Working with class A
        wrapper outer = new wrapper();   // outer class object
        A Amit = outer.new A("Amit");    // inner class object
        Amit.name = "other name";

        A tempObj;
        for (int i = 0; i < 1000000; i++) {
            tempObj = outer.new A("Random name");
        }

        System.out.println("Name: " + Amit.name);
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    class A {
        final int num = 10;
        String name;

        public A(String name) {
            this.name = name;
        }
    }
}

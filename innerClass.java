package OOPs.SataticExample;

public class innerClass {
    static class Test{
        String name;
        public Test(String name){
            this.name=name;
        }
    }

    public static void main(String[] args) {
        Test a =new Test("Amit");
        Test b =new Test("sujit");


        System.out.println(a.name);
        System.out.println(b.name);
    }
}

package OOPs.SataticExample;

public class StaticBlock {
    static int a = 5;
    static int b;
// static only runs once
    static{
        System.out.println("I am in static block");
        b= 5*a;
    }

    public static void main(String[] args){
        System.out.println(a+" "+b);
    }

}

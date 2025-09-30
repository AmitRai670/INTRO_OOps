package OOPs.Polymorphism;

public class Circle extends Shapes {
    @Override
    void area(){
        System.out.println("I am in circle");
    }
}
// final is used to not override
// static connot be override
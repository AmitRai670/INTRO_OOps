package OOPs.inheritance;

public class Main {
    public static void main(String[] args) {
//        box Box1 = new box();

//        System.out.println(Box1.l+" "+Box1.h+" "+Box1.w);

        Boxweight box2 =new Boxweight();
        Boxweight box3 =new Boxweight(2,3,4,5);

        System.out.println(box2.h+" "+ box3.weight);
    }
}

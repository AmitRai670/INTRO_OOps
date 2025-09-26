package OOPs.SataticExample;

public class Main {
    public static void main(String[] args){
        Human Amit = new Human(22,"Amit",10000,false);
        Human Sujit= new Human (19,"Sujit",50000,true);

        System.out.println(Amit.population);
        System.out.println(Sujit.population);

    }
}

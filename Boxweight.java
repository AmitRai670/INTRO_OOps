package OOPs.inheritance;

public class Boxweight extends box{
    double weight;

    public Boxweight(){
        this.weight=-1;

    }
    public Boxweight(double l,double h, double w,double weight){
        super(l,h,w);
        this.weight=weight;
    }
}

package OOPs.inheritance;

class Boxweight extends box {
    double weight;

    Boxweight() {
        super();
        this.weight = -1;
    }

    Boxweight(Boxweight other) {
        super(other);     // calls Box copy constructor
        this.weight = other.weight;
    }

    Boxweight(double l, double h, double w, double weight) {
        super(l, h, w);
        this.weight = weight;
    }

    Boxweight(double side, double weight){
        super(side);
        this.weight = weight;
    }
}

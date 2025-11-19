package methodOverLoading;

public class Area {
    public double area(double side){
        return side * side;
    }
//    public double area(int radius){
//        return 3.75*radius*radius;
//    }
    public double area(double length, double breadth) {
        return length * breadth;
    }
}




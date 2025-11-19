package methodOverLoading;

public class Rectangle extends Shape {

    Rectangle(double length, double breadth) {
       super(length, breadth);
    }

    void area() {
        double area = this.length * this.width;
        System.out.println("methodOverLoading.Area of methodOverLoading.Rectangle: " + area);
    }
}

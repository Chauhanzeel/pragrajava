package methodOverLoading;

class Shape {
    double length, width;

    Shape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void area() {
        System.out.println("methodOverLoading.Area of shape cannot be determined");
    }
}

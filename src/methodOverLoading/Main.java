package methodOverLoading;

public class Main {
    public static void main(String[] args) {
//     methodOverLoading.Student student = new methodOverLoading.Student();
//
//     student.name="Zeel";
//     student.email="abc@gmail.com";
//     student.course="Java";
//
//     student.study();
//     student.talk();
//     student.walk();
//
//     System.out.println(student);

        Area a = new Area();

        System.out.println("area of a square is :" + a.area(5));
        System.out.println("area of a rectangle is :" + a.area(5,10));

//        a.area(20,40);
    }
}


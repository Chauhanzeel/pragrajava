package methodOverLoading;

public class Student extends Person {
    String course;

    public void study(){
        System.out.println("methodOverLoading.Student study");
    }
    public String toString(){
        return "methodOverLoading.Student name: "+name+" email: "+email+" course: "+course;
    }
}
